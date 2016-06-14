<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 
  <body>
  <script src="js/jquery.js"></script>
  <script src="js/leader.js"></script>
 
    <div id="wrapper">
 		<jsp:include page="menu.jsp"></jsp:include>
        <div id="page-wrapper" >
           <div class="dataTable_wrapper">
                        <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>姓名</th>
                                            <th>专业</th>
                                            <th>职称</th>
                                            <th>简介</th>
                                           	<th>图片</th>
                                           	<th>功能</th>
                                        </tr>
                                    </thead>
                                    <tbody >
                                    
                                          <tr class="gradeA">
                                            <td><input name="name" class="form-control"></td>
                                            <td><input name="xibie" class="form-control" value="fvdgdf"></td>
                                            <td><input name="zhicheng" class="form-control"></td>
                                            <td><textarea name="jianjie" class="form-control" rows="2"></textarea></td>
                                            <td > <button type="button" class="btn btn-outline btn-warning">修改图片</button></td>
                                            <td> <button type="button" class="btn btn-outline btn-warning modify" >修改</button>
                                            <button type="button" class="btn btn-outline btn-danger">删除</button></td>
                                    </tbody>
                                </table>
                               
                            </div>
                             <div class="dataTable_wrapper">
                             <form action="">
                                <table class="table table-striped table-bordered table-hover" >
                                    <thead>
                                        <tr>
                                            <th>姓名</th>
                                            <th>专业</th>
                                            <th>职称</th>
                                            <th>简介</th>
                                           	<th>图片</th>
                                           	<th>添加</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <tr class="gradeA">
                                           <td><input name="name" class="form-control"></td>
                                            <td><input name="xibie" class="form-control" value="fvdgdf"></td>
                                            <td><input name="zhicheng" class="form-control"></td>
                                            <td><textarea name="jianjie" class="form-control" rows="2"></textarea></td>
                                           	<td> <input type="file"></td>
                                            <td><input type="submit"  class="btn btn-outline btn-success" value="添加"> </td>
                                        </tr>
                                    </tbody>
                                </table>
                                </form>
                            </div>
                            
        </div>
        <!-- /#page-wrapper -->

    </div>
   
  </body>
</html>
