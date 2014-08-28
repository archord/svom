<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Flot Examples: AJAX</title>
    <link href="styles/examples.css" rel="stylesheet" type="text/css">
    <!--[if lte IE 8]><script language="javascript" type="text/javascript" src="../../excanvas.min.js"></script><![endif]-->
    <script language="javascript" type="text/javascript" src="js/plot/jquery.js"></script>
    <script language="javascript" type="text/javascript" src="js/plot/jquery.flot.js"></script>
    <script language="javascript" type="text/javascript" src="js/plot/jquery.flot.selection.js"></script>
    <script language="javascript" type="text/javascript" src="js/plot/jquery.flot.navigate.js"></script>
    <script language="javascript" type="text/javascript" src="js/plot/jquery.flot.symbol.js"></script>
    <script type="text/javascript">

      $(function() {

        var option1 = {
          points: {
            show: true
          },
          grid: {
            hoverable: true,
            clickable: true
          },
          selection: {
            mode: "xy"
          }
        };
        var option2 = {
          legend: {
            show: false
          },
          xaxis: {
            show: false
          },
          yaxis: {
            show: false
          },
          grid: {
            color: "#999"
          },
          selection: {
            mode: "xy"
          }
        };

        var plot;
        var overview;

        var dataObj = [];
        var otl2 = [];
        var otl2cur = [];
        //fill: true, fillColor: 'purple',
        var drawData = [
          {
            label: "ot-level2",
            data: [],
            color: '#71c73e',
            points: {show: true, radius: 2}
          },
          {
            label: "ot-level2-cur",
            data: [],
            color: 'purple',
            points: {show: true, radius: 4}
          }
        ];
        var drawDataOverView = [
          {
            label: "ot-level2",
            data: [],
            color: '#71c73e',
            points: {show: true, fill: true, fillColor: '#71c73e', radius: 1}
          },
          {
            label: "ot-level2-cur",
            data: [],
            color: 'purple',
            points: {show: true, radius: 2}
          }
        ];
        var dataurl = "<%=request.getContextPath()%>/get-ot-xy-list.action";
        function onDataReceived(result) {
          dataObj = result.gridModel;
          for (var i = 0; i < dataObj.length; i++) {
            if (dataObj[i].lastFfNumber === 722 || dataObj[i].lastFfNumber === 592) {
              otl2cur.push([dataObj[i].xtemp, dataObj[i].ytemp]);
            } else {
              otl2.push([dataObj[i].xtemp, dataObj[i].ytemp]);
            }
          }

          drawData[0].data = otl2;
          drawData[1].data = otl2cur;

          drawDataOverView[0].data = otl2;
          drawDataOverView[1].data = otl2cur;

          plot = $.plot("#placeholder", drawData, option1);
          overview = $.plot("#overview", drawDataOverView, option2);
        }

        $.ajax({
          url: dataurl,
          type: "GET",
          dataType: "json",
          success: onDataReceived
        });


        $("<div id='tooltip'></div>").css({
          position: "absolute",
          display: "none",
          border: "1px solid #fdd",
          padding: "2px",
          "background-color": "#fee",
          opacity: 0.80
        }).appendTo("body");

        $("#placeholder").bind("plothover", function(event, pos, item) {
          if (item) {
            var x = item.datapoint[0].toFixed(2);
            var y = item.datapoint[1].toFixed(2);

            $("#tooltip").html(dataObj[item.dataIndex].identify + " (" + x + ", " + y + ")")
                    .css({top: item.pageY + 5, left: item.pageX + 5})
                    .fadeIn(200);
          } else {
            $("#tooltip").hide();
          }
        });

        $("#placeholder").bind("plotclick", function(event, pos, item) {
          if (item) {
//            alert("click point " + item.dataIndex + " in " + item.series.label);
            openDialog(dataObj[item.dataIndex].name);
            plot.highlight(item.series, item.datapoint);
          }
        });

        $("#placeholder").bind("plotselected", function(event, ranges) {

          // clamp the zooming to prevent eternal zoom

          if (ranges.xaxis.to - ranges.xaxis.from < 0.00001) {
            ranges.xaxis.to = ranges.xaxis.from + 0.00001;
          }

          if (ranges.yaxis.to - ranges.yaxis.from < 0.00001) {
            ranges.yaxis.to = ranges.yaxis.from + 0.00001;
          }

          // do the zooming

          plot = $.plot("#placeholder", drawData,
                  $.extend(true, {}, options, {
            xaxis: {min: ranges.xaxis.from, max: ranges.xaxis.to},
            yaxis: {min: ranges.yaxis.from, max: ranges.yaxis.to}
          })
                  );

          // don't fire event on the overview to prevent eternal loop

          overview.setSelection(ranges, true);
        });

        $("#overview").bind("plotselected", function(event, ranges) {
          plot.setSelection(ranges);
        });

        function openDialog(otName) {
          openwindow("get-ot-image-list.action?otName=" + otName, '_blank', 800, 500, 800, 500);
          return false;
        }
        function openwindow(url, name, width, height, iWidth, iHeight)
        {
          var iTop = (window.screen.availHeight - 30 - iHeight) / 2;       //获得窗口的垂直位置;
          var iLeft = (window.screen.availWidth - 10 - iWidth) / 2;           //获得窗口的水平位置;
          window.open(url, name,
                  'height=' + height +
                  ',innerHeight=' + iHeight +
                  ',width=' + width +
                  ',innerWidth=' + iWidth +
                  ',top=' + iTop +
                  ',left=' + iLeft +
                  ',toolbar=no,menubar=no,scrollbars=auto,resizeable=yes,location=no,status=yes');
        }
      });

    </script>
  </head>
  <body>

    <div id="content">
      <div class="demo-container">
        <div id="placeholder" class="demo-placeholder" style="float:left; width:650px;"></div>
        <div id="overview" class="demo-placeholder" style="float:right;width:160px; height:125px;"></div>
      </div>
    </div>

  </body>
</html>