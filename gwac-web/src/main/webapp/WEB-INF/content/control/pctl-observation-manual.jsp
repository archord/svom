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
    <title>GWAC观测-手动控制</title>
    <meta name="viewport" content="width=1000, initial-scale=1.0, maximum-scale=1.0">
    <meta http-equiv="Content-Style-Type" content="text/css" />
    <meta http-equiv="pragma" content="no-cache" />
    <meta http-equiv="cache-control" content="no-cache" />
    <meta http-equiv="expires" content="0" />
    <meta http-equiv="keywords" content="国家天文台，svom, gwac，望远镜阵列" />
    <meta http-equiv="description" content="GWAC观测手动控制页面" />
    <link type="image/x-icon" rel="shortcut icon" href="${pageContext.request.contextPath}/resource/sysimg/favicon.ico"/>
    <link href="${pageContext.request.contextPath}/resource/multiselect/bootstrap-3.3.2.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resource/multiselect/bootstrap-multiselect.css" rel="stylesheet">

    <style type="text/css"> 
      html, body {
        padding: 0;
        margin: 0;
        height: 100%;
        width:100%;  
        text-align: center;
      }
      .obs_plan_table {width:98%}
      .obs_plan {  
        width:98%;  
        height: 98%;
        overflow:auto;  
        white-space: nowrap;
      }  
      .tab_container{
        width:99%; 
        height: 93%;
        text-align: center;
        border:0;
      }
      .manual_container1_col{padding: 5px; text-align: center}
      .manual_container1{
        border: 3px solid #c5c5c5;
        margin: 100px auto;
        padding: 5px;
        text-align: left;
        width: 800px;
        font-size: 20px;
      }
      .manual_container1 span{  
        white-space: nowrap;  /*强制span不换行*/
        display: inline-block;  /*将span当做块级元素对待*/
        overflow: hidden;  /*超出宽度部分隐藏*/
        text-overflow: ellipsis;  /*超出部分以点号代替*/
        line-height: 0.9;  /*数字与之前的文字对齐*/
      }
      .manual_container1 input{  
        margin: 2px;
        width: 200px;
      }
      .manual_container1 select {
        width: 200px;
        background: #fff;
        margin: 2px;
      }
      .manual_container1 .timeinput{  
        margin: 2px;
        font-size: 20px;
        width: 200px;
      }
      .manual_container_title{
        text-align: center;
        font-size: 26px;
        background-color: #eee;
        margin:  -5px 0px 5px 0px;
      }
      .manual_container2{
        border: 3px solid #c5c5c5;
        min-height: 343px;
        padding: 5px;
        margin-bottom: 10px;
      }
      .background {fill: #000;}
      line {stroke: #000;}
    </style>  
  </head>
  <body>

    <div id="tabs" style="width:98%; height:100%;margin:0 auto;border:0;">
      <div style="display: none;">
        <input type="hidden" id="gwacRootURL" value="${pageContext.request.contextPath}"/>
      </div>      

      <div class="tab_container">
        <div class="row">
          <div class="col-xs-12 col-sm-12 col-md-12 manual_container1_col">
            <div class="manual_container1">
              <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12 " >
                  <div class="manual_container_title">
                    手动生成观测计划</div>
                </div>
              </div>
              <form action="/gwebend/observationPlanUpload.action" id="genObsPlanForm">
                <div class="row">
                  <div class="col-xs-12 col-sm-12 col-md-12">
                    <table>
                    </table>
                  </div>
                </div>
                <div class="row">
                  <div class="col-xs-12 col-sm-12 col-md-12">
                    <table>
                      <tr><td width="150px">本地时间：</td><td width="250px"><input name="localTime" id="localTime" class="timeinput"/></td>
                        <td width="150px">UTC时间：</td><td><input name="utcTime" id="utcTime" class="timeinput"/></td></tr>
                      <tr><td>本地恒星时：</td><td><input name="siderealTime" id="siderealTime" class="timeinput"/></td>
                        <td>儒略日：</td><td><input name="julDay" id="julDay" class="timeinput"/></td></tr>
                      <tr><td>望远镜单元：</td><td>
                          <select height="30" name="unitId">
                            <option value="000">未选择</option>
                            <option value="001">单元01</option>
                            <option value="002">单元02</option>
                            <option value="003">单元03</option>
                            <option value="004">单元04</option>
                            <option value="005">单元05</option>
                            <option value="006">单元06</option>
                            <option value="007">单元07</option>
                            <option value="008">单元08</option>
                          </select></td>
                        <td>转台：</td><td>
                          <select height="30" name="unitId">
                            <option value="000">未选择</option>
                            <option value="001">转台01</option>
                            <option value="002">转台02</option>
                            <option value="003">转台03</option>
                            <option value="004">转台04</option>
                            <option value="005">转台05</option>
                            <option value="006">转台06</option>
                            <option value="007">转台07</option>
                            <option value="008">转台08</option>
                          </select></td></tr>
                      <tr><td>观测类型：</td><td>
                          <select height="30" name="obsType">
                            <option value="">未选择</option>
                            <option value="monitor">监测型</option>
                            <option value="template">模板观测型</option>
                            <option value="patrol">巡视型</option>
                            <option value="synchronize">同步型</option>
                            <option value="ToO_auto">自动触发型</option>
                            <option value="ToO_manual">手动触发型</option>
                            <option value="manual">手动型</option>
                          </select></td>
                        <td>图像类型：</td><td>
                          <select height="30" name="imgType">
                            <option value="">未选择</option>
                            <option value="bias">本底</option>
                            <option value="dark">暗场</option>
                            <option value="flat">平场</option>
                            <option value="light">常规观测</option>
                            <option value="focus">调焦</option>
                          </select></td></tr>
                      <tr><td>天区分区方式：</td><td>
                          <select height="30" name="gridId">
                            <option value="">未选择</option>
                            <option value="01">G01</option>
                          </select></td>
                        <td>观测天区：</td><td>
                          <select height="30" name="fieldId">
                            <option value="">未选择</option>
                            <option value="bias">F01</option>
                          </select></td></tr>
                      <tr><td>赤经(时分秒)：</td><td><input name="ra" value="60.0"/></td>
                        <td>赤纬(度分秒)：</td><td><input name="dec" value="60.0"/></td></tr>
                      <tr><td>曝光时间(秒)：</td><td><input name="expusoreDuring" value="10"/></td>
                        <td>曝光间隔(秒)：</td><td><input name="delay" value="5"/></td></tr>
                      <tr><td>观测帧数(帧)：</td><td><input name="frameCount"/></td>
                        <td>优先级：</td><td><input name="priority"/></td></tr>
                      <tr><td>开始时间：</td><td><input name="beginTime" class="timeinput" onclick="WdatePicker({dateFmt: 'yyyy-MM-dd HH:mm:ss'})" class="Wdate timeinput" /></td>
                        <td>结束时间：</td><td><input name="endTime" class="timeinput" onclick="WdatePicker({dateFmt: 'yyyy-MM-dd HH:mm:ss'})" class="Wdate timeinput" /></td></tr>

                    </table>
                    <button type="button" id="genObsPlanBtn">生成观测计划</button>
                  </div>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>

    </div>

    <script src="${pageContext.request.contextPath}/resource/multiselect/jquery-2.1.3.min.js"></script>
    <script src="${pageContext.request.contextPath}/resource/multiselect/bootstrap-3.3.2.min.js"></script>
    <script src="<%=request.getContextPath()%>/resource/jquery-ui-1.12.1/jquery-ui.min.js"></script>
    <script src="${pageContext.request.contextPath}/resource/js/date/My97DatePicker/WdatePicker.js"></script>
    <script src="<%=request.getContextPath()%>/resource/js/d3/d3.min.js"></script>
    <script src="<%=request.getContextPath()%>/resource/js/pctl-observation-manual.js"></script>


  </body>
</html>