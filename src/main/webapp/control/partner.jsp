<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
  <body>
   <script src="${pageContext.request.contextPath}/control/js/jquery.js"></script>
   <script src="${pageContext.request.contextPath}/control/js/partner.js"></script>
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
                                     <c:forEach items="${list}" var="Department" >
                                        <tr class="gradeA">
                                            <td><input name="name" value="${Department.name}" class="form-control"></td>
                                            <td><input name="url" value="${Department.url}" class="form-control">
                                            	<input name="id"  value="${Department.id}" type="hidden">
                                            	<input name="pictureId"  value="${Department.picture.id}" type="hidden">
                                            </td>
                                           	<td><a href="${pageContext.request.contextPath}/control/picture/getPicture.do?id=${Department.picture.id}">
                                           	<button type="button" class="btn btn-outline btn-warning">修改图片</button></a></td>
                                            <td> <button type="button" class="btn btn-outline btn-warning modify">保存</button></td>
                                           	<td><button type="button" class="btn btn-outline btn-danger del">删除</button></td>
                                        </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                              <div class="dataTable_wrapper">
                             <form id="mform"   method="post"  enctype="multipart/form-data">
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
                                            <td><input name="name" class="form-control"></td>
                                            <td><input name="url" class="form-control"></td>
                                           	<td><input name="file"  type="file"></td>
                                           <td><button type="button" class="btn btn-outline btn-success add">添加</button></td>
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
