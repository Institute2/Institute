<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
    <div id="wrapper">
    <jsp:include page="menu.jsp"></jsp:include>
         <div id="page-wrapper">
        	<td> <button type="button" class="btn btn-outline btn-success">添加</button> </td>
            <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>论文标题</th>
                                            <th>发布人</th>
                                            <th>发布时间</th>
                                            <th>修改</th>
                                           	<th>删除</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="gradeA">
                                            <td>似的撒旦</td>
                                            <td> </td>
                                            <td>的撒大苏打</td>
                                            <td><a href="updatePapers.jsp" ><button type="button" class="btn btn-outline btn-warning">修改</button></a></td>
                                           	<td><button type="button" class="btn btn-outline btn-danger">删除</button></td>
                                        </tr>
                                        
                                    </tbody>
                                </table>
                            </div>
           
        </div>
    </div>
  </body>
</html>
