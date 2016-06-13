<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <th>项目名称</th>
                                            <th>负责人</th>
                                            <th>项目发布时间</th>
                                           	<th>添加</th>
  </head>
  <body>
  <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover" >
                                    <tbody>
                                        <tr class="gradeA">
                                            <td>项目名称：</td>
                                            <td><input ></td>
                                        </tr>
                                         <tr class="gradeA">
                                            <td>负责人：</td>
                                            <td> <select >
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                            </select>
                                            </td>
                                        </tr>
                                         <tr class="gradeA">
                                            <td>：</td>
                                            <td></td>
                                        </tr>
                                          <tr class="gradeA">
                                            <td>新闻图片重传：</td>
                                            <td><input type="file"></td>
                                        </tr>
                                         <tr class="gradeA">
                                            <td>论文内容：</td>
                                            <td><textarea class="form-control" rows="5"></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
 
   
  </body>
</html>
