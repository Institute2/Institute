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
                                            <th>姓名</th>
                                            <th>方向</th>
                                            <th>公司</th>
                                            <th>简介</th>
                                           	<th>图片</th>
                                           	<th>功能</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="gradeA">
                                            <td></td>
                                            <td></td>
                                             <td></td>
                                            <td></td>
                                           	<td><a href="updatePicture.jsp?url=das&id=llll">
                                            <button type="button" class="btn btn-outline btn-warning">修改图片 </button></a></td>
                                            <td><a href="/institute/control/updateGrads.do&id=llll">
                                            <button type="button" class="btn btn-outline btn-warning">修改 </button></a>
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
                                            <th>姓名</th>
                                            <th>方向</th>
                                            <th>公司</th>
                                            <th>简介</th>
                                           	<th>图片</th>
                                           	<th>添加</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="gradeA">
                                            <td><input class="form-control"></td>
                                            <td><input class="form-control"></td>
                                            <td><input class="form-control"></td>
                                            <td><textarea class="form-control" rows="2"></textarea></td>
                                           	<td> <input type="file"></td>
                                            <td> <input type="submit" class="btn btn-outline btn-success" value="添加"/ > </td>
                                        </tr>
                                        
                                    </tbody>
                                </table>
                                </form>
                            </div>
        </div>
           
        </div>
  </body>
</html>
