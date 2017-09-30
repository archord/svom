<%-- 
    Document   : observing
    Created on : 2017-8-18, 10:09:04
    Author     : xy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="robots" content="noindex">
    <title>GWAC观测计划列表</title>
    <meta name="viewport" content="width=1000, initial-scale=1.0, maximum-scale=1.0">
    <meta http-equiv="Content-Style-Type" content="text/css" />
    <meta http-equiv="pragma" content="no-cache" />
    <meta http-equiv="cache-control" content="no-cache" />
    <meta http-equiv="expires" content="0" />
    <meta http-equiv="keywords" content="国家天文台，svom, gwac，望远镜阵列" />
    <meta http-equiv="description" content="GWAC观测计划列表页面" />
    <link type="image/x-icon" rel="shortcut icon" href="${pageContext.request.contextPath}/resource/sysimg/favicon.ico"/>
    <link href="${pageContext.request.contextPath}/resource/multiselect/bootstrap-3.3.2.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resource/multiselect/bootstrap-multiselect.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resource/css/jquery.dataTables.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resource/css/gwac-ui.css" rel="stylesheet">
  </head>
  <body>

    <div style="display: none;">
      <input type="hidden" id="gwacRootURL" value="${pageContext.request.contextPath}"/>
    </div>      
    <div id="tabs-monitor-table-div" style="width:100%; height:100%;margin:0 auto;border:0;">
      <div>
        待执行观测计划列表&nbsp;&nbsp;&nbsp;&nbsp;
        <select height="30"><option>全部望远镜</option>
          <option>望远镜01</option>
          <option>望远镜02</option>
          <option>望远镜03</option>
          <option>望远镜04</option>
          <option>望远镜05</option>
          <option>望远镜06</option>
          <option>望远镜07</option>
          <option>望远镜08</option>
        </select>
      </div>
      <div id="ot-list">
        <table id="obs-plan-table" class="display" cellspacing="0" width="100%">
          <thead><tr><th>1</th><th>ID</th><th>生成时间</th><th title="(GID-UID)">望远镜</th><th>观测类型</th><th title="(GID-FID)">天区</th>
              <th title="(RA-DEC)J2000">位置</th><th>图像类型</th><th title="曝光(延迟)">曝光时间</th><th>总帧数</th><th>优先级</th><th>起止时间</th>
              <th>ObjID</th><th title="(RA-DEC-ERR)J2000">目标位置</th><th>分组ID</th><th>计划类型</th></tr></thead>

          <tfoot><tr><th>1</th><th>ID</th><th>生成时间</th><th title="(GID-UID)">望远镜</th><th>观测类型</th><th title="(GID-FID)">天区</th>
              <th title="(RA-DEC)J2000">位置</th><th>图像类型</th><th title="曝光(延迟)">曝光时间</th><th>总帧数</th><th>优先级</th><th>起止时间</th>
              <th>ObjID</th><th title="(RA-DEC-ERR)J2000">目标位置</th><th>分组ID</th><th>计划类型</th></tr></tfoot>
        </table>
      </div>  
    </div>

    <script src="${pageContext.request.contextPath}/resource/multiselect/jquery-2.1.3.min.js"></script>
    <script src="${pageContext.request.contextPath}/resource/multiselect/bootstrap-3.3.2.min.js"></script>
    <script src="<%=request.getContextPath()%>/resource/jquery-ui-1.12.1/jquery-ui.min.js"></script>
    <script src="${pageContext.request.contextPath}/resource/js/jquery.dataTables.min.js"></script>
    <script src="${pageContext.request.contextPath}/resource/js/date/My97DatePicker/WdatePicker.js"></script>
    <script src="<%=request.getContextPath()%>/resource/js/d3/d3.min.js"></script>
    <script src="<%=request.getContextPath()%>/resource/js/pctl-observation-plan.js"></script>


  </body>
</html>