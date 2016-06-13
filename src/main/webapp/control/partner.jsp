<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 
  <body>
   
    <div id="wrapper">
	<jsp:include page="menu.jsp"></jsp:include>
        <div id="page-wrapper">
            <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>相关单位名称</th>
                                            <th>相关单位链接</th>
                                            <th>图片</th>
                                            <th>修改</th>
                                           	<th>删除</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="gradeA">
                                            <td><input class="form-control"></td>
                                            <td><input class="form-control"></td>
                                           	<td> <button type="button" class="btn btn-outline btn-warning">修改图片</button> </td>
                                            <td> <button type="button" class="btn btn-outline btn-warning">修改</button></td>
                                           	<td><button type="button" class="btn btn-outline btn-danger">删除</button></td>
                                        </tr>
                                        
                                    </tbody>
                                </table>
                            </div>
                              <div class="dataTable_wrapper">
                              <form action="">
                                <table class="table table-striped table-bordered table-hover" >
                                    <thead>
                                        <tr>
                                            <th>相关单位名称</th>
                                            <th>相关单位链接</th>
                                            <th>图片</th>
                                            <th>添加</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="gradeA">
                                            <td><input class="form-control"></td>
                                            <td><input class="form-control"></td>
                                           	<td> <input type="file"></td>
                                           <td> <input type="submit" class="btn btn-outline btn-success" value="添加" /></td>
                                        </tr>
                                    </tbody>
                                </table>
                                </form>
                            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
  </body>
</html>
