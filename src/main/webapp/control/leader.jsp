<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 
  <body>
   <script type="text/javascript" src="js/jquery.js"></script>
 	<script type="text/javascript" src="js/demo.js"></script>
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
                                    <tbody>
                                     
                                        <tr class="gradeA">
                                            <td><input class="form-control"></td>
                                            <td><input class="form-control" value="fvdgdf"></td>
                                             <td><input class="form-control"></td>
                                            <td><textarea class="form-control" rows="2"></textarea></td>
                                           	  <td > <button type="button" class="btn btn-outline btn-warning">修改图片</button></td>
                                            <td> <button type="button" class="btn btn-outline btn-warning">保存</button>
                                             <button type="button" class="btn btn-outline btn-danger">删除</button></td>
                                        </tr>
                                        
                                    </tbody>
                                </table>
                            </div>
                             <div class="dataTable_wrapper">
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
                                        
                                            <td><input id="name" value="adsa" class="form-control"></td>
                                            <td><input id="xiebie" class="form-control"></td>
                                             <td><input id="zhichen" class="form-control"></td>
                                            <td><textarea id="jianjie" class="form-control" rows="2"></textarea></td>
                                           	<td> <input type="file"></td>
                                             <td><button type="button" id="sub" class="btn btn-outline btn-success">添加</button> </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
        </div>
        <!-- /#page-wrapper -->

    </div>

  </body>
</html>
