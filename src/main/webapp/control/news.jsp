<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
    <div id="wrapper">
    <jsp:include page="menu.jsp"></jsp:include>
        <div id="page-wrapper">
        	<td> <button type="button" class="btn btn-outline btn-success">添加</button></td>
            <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>新闻标题</th>
                                            <th>发布人</th>
                                            <th>发布时间</th>
                                            <th>修改</th>
                                           	<th>删除</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="gradeA">
                                            <td>请问请问</td>
                                            <td> <select class="form-control">
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                            </select></td>
                                            <td>请问请问</td>
                                            <td> <button type="button" class="btn btn-outline btn-warning">修改</button></td>
                                           	<td><button type="button" class="btn btn-outline btn-danger">删除</button></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
           
        </div>
        <!-- /#page-wrapper -->
    </div>
  </body>
</html>
