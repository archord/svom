
(function($) {

  function maybeCall(thing, ctx) {
    return (typeof thing == 'function') ? (thing.call(ctx)) : thing;
  }

  function Gwac(placeholder, root, url) {
    this.placeholder = placeholder;
    this.rootUrl = root;
    this.url = root + "/" + url;
    this.pingsUrl = this.rootUrl + "/resource/images/pings.png";
  }

  Gwac.prototype = {
    reqNum: 1,
    curSerialNum: 0,
    maxNumber: 0,
    firstOor: {},
    graticule: {data: d3.geo.graticule()(), class: "graticule"}, //球面网格，经度纬度方向上以10度为间隔
    labelPoint: {data: {type: "MultiPoint", coordinates: []}, class: "origin", radius: 1},
    sphere: {data: {type: "Sphere"}, class: "sphere"}, //投影平面外侧圆
    equator: {data: {type: "LineString", coordinates: [[-180, 0], [-90, 0], [0, 0], [90, 0], [180, 0]]}, class: "equator"}, //赤道
    primemeridian: {data: {type: "LineString", coordinates: [[0, 90], [0, 0], [0, -90]]}, class: "primemeridian"}, //本初子午线
    origin: {data: {type: "Point", coordinates: [0, 0]}, class: "origin"}, //原点
    templateborder: {data: {type: "Polygon", coordinates: []}, class: "templateborder"},
    galacticplane: {data: {type: "LineString", coordinates: []}, class: "galacticplane"},
    eclipticplane: {data: {type: "LineString", coordinates: []}, class: "eclipticplane"},
    horizon: {data: {type: "LineString", coordinates: []}, class: "horizon"},
    ot1Data: {type: "Point", class: "ot1", radius: 1, stars: []},
    ot1Data2: {data: {type: "MultiPoint", coordinates: []}, class: "ot1", radius: 1},
    ot2TimeSequence: {},
    ot1: [],
    ot2: [],
    ot2mch: [],
    ot2cur: [],
    ot2new: [],
    varstar: [],
    curnode: "",
    ot1DrawInterval: 1,
    parseData: function(reqData) {
      gwac = this;
      gwac.ot2TimeSequence = reqData.ot2TimeSequence;
      gwac.firstOor = reqData.firstOor;
      gwac.maxNumber = reqData.maxNumber;

      for (var i = 0; i <= this.maxNumber; i++) {
        gwac.ot1[i] = [];
      }
      $.each(this.ot2TimeSequence, function(i, item) {
        gwac.ot1[item.number].push([item.ra, item.dec]);
      });
      this.genLabelPoint();
    },
    draw: function() {

      var gwac = this;
      d3.select(gwac.placeholder + " svg").remove();

      var degrees = 180 / Math.PI;
      var time = Date.now();
      var ratio = window.devicePixelRatio || 1;
      var p = ratio;
      var width = $(gwac.placeholder).width();
      var height = $(gwac.placeholder).height();
      var scale = height / 3 - 1;  //显示的大小,相对于单位长度
      var clipAngle = 90 - 5;  //投影显示的部分，180显示整个球 1E-6
      var precision = 0.1; //线采样精度
      var rotate = [20, -40, 0]; //初始角度
      var velocity = [.01, 0, 0]; //转速

      var projection = d3.geo.orthographic()
              .scale(scale)
              .translate([width / 2, height / 2])
              .clipAngle(clipAngle)
              .clipExtent([[-1, -1], [width + 1, height + 1]])
              .precision(precision);

      var tooltip = d3.select("#tooltip");
      var path = d3.geo.path().projection(projection);
      var svg = d3.select(gwac.placeholder).append("svg").attr("width", width).attr("height", height);
      gwac.path = path;
      gwac.svg = svg;

      var zoom = d3.geo.zoom().projection(projection)
              .scaleExtent([scale, Infinity])
              .on("zoom", function() {
                svg.selectAll("*").remove();
                svg.append("image").attr("xlink:href", gwac.pingsUrl).attr("width", 40).attr("height", 40).attr("x", 10).attr("y", 10);
                svg.append("path").datum(gwac.graticule.data).attr("class", gwac.graticule.class).attr("d", path);
                svg.append("path").datum(gwac.sphere.data).attr("class", gwac.sphere.class).attr("d", path);
                svg.append("path").datum(gwac.equator.data).attr("class", gwac.equator.class).attr("d", path);
                svg.append("path").datum(gwac.primemeridian.data).attr("class", gwac.primemeridian.class).attr("d", path);

                gwac.drawOt1(svg, path);
                $.each(gwac.labelPoint.data.coordinates, function(i, item) {
                  var tdata = {type: "Point", coordinates: item};
                  svg.append("path").datum(tdata).attr("class", gwac.labelPoint.class).attr("d", path.pointRadius(gwac.labelPoint.radius)).append("title").text("(" + item[0] + "," + item[1] + ")");
                });
              });

      svg.call(zoom).call(zoom.event);
      gwac.zoomBounds(projection, zoom, path, gwac.ot1Data2.data);
      svg.transition().ease("quad-in-out").duration(2000).call(zoom.projection(projection).event);

    },
    drawOt1: function() {
      var gwac = this;
      gwac.ot1Data2.data.coordinates = gwac.ot1[gwac.curSerialNum];
      gwac.curnode = gwac.svg.append("path").datum(gwac.ot1Data2.data).attr("class", gwac.ot1Data2.class).attr("d", gwac.path.pointRadius(1)).attr("d", gwac.path);
    },
    getBounds: function() {
      var gwac = this;
      var bounds = {type: "Feature", geometry: {type: "Polygon", coordinates: [[[30, 30], [0, 10], [10, 0], [0, -10], [-10, 0]]]}};
      return bounds;
    },
    zoomBounds: function(projection, zoom, path, o) {

      var gwac = this;
      var width = $(gwac.placeholder).width();
      var height = $(gwac.placeholder).height();
      var centroid = d3.geo.centroid(o),
              clip = projection.clipExtent();

      projection.rotate(true ? [-centroid[0], -centroid[1]] : zoom.rotateTo(centroid))
              .clipExtent(null)
              .scale(1)
              .translate([0, 0]);

      var b = path.bounds(o),
              k = Math.min(1000, .45 / Math.max(Math.max(Math.abs(b[1][0]), Math.abs(b[0][0])) / width, Math.max(Math.abs(b[1][1]), Math.abs(b[0][1])) / height));

      projection.clipExtent(clip)
              .scale(k)
              .translate([width / 2, height / 2]);
    },
    genLabelPoint: function() {
      var gwac = this;
      var tpoints = gwac.labelPoint.data.coordinates;
      while (tpoints.length > 0) {
        tpoints.pop();
      }
      tpoints.push([0, 89.9999]);
      tpoints.push([0, -89.9999]);
      for (var i = 0; i < 360; i += 60) {
        for (var j = -60; j <= 60; j += 30) {
          tpoints.push([i, j]);
        }
      }
    }
  };

  $.gwac = function(placeholder, root, url) {
    var gwac = new Gwac(placeholder, root, url);
    return gwac;
  };

})(jQuery);