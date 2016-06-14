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
                                            <th>项目名称</th>
                                            <th>负责人</th>
                                            <th>项目链接</th>
                                            <th>项目完成时间</th>
                                           	<th>功能</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="gradeA">
                                            <td><input name="title"class="form-control"></td>
                                            <td><input name="leader" class="form-control"></td>
                                            <td><input name="content" class="form-control"></td>
                                            <td> </td>
                                           <td> <button type="button" class="btn btn-outline btn-warning modify">保存</button>
                                             	<button type="button" class="btn btn-outline btn-danger">删除</button></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>   
                             <div class="dataTable_wrapper">
                             <form action="">
                                <table class="table table-striped table-bordered table-hover" >
                                    <thead>
                                        <tr>
                                            <th>项目名称</th>
                                            <th>负责人</th>
                                            <th>项目链接</th>
                                            <th>项目发布时间</th>
                                            <th>项目完成时间</th>
                                           	<th>添加</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="gradeA">
                                            <td><input name="title"class="form-control"></td>
                                            <td><input name="leader" class="form-control"></td>
                                            <td><input name="content" class="form-control"></td>
                                            <td><input type="date" name="deadline" onkeyup="value=value.replace(/[^\d-]/g,'')"
												placeholder="yyyy-mm-dd">
                                            </td>
                                            <td><input type="date" name="startline" onkeyup="value=value.replace(/[^\d-]/g,'')"
												placeholder="yyyy-mm-dd">
                                            </td>
                                            <td><input type="submit" class="btn btn-outline btn-success" value="添加"/> </td>
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
