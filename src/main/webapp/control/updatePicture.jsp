<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
  <body>
   <script src="${pageContext.request.contextPath}/control/js/jquery.js"></script>
   <script src="${pageContext.request.contextPath}/control/js/picture.js"></script>
     <div id="wrapper">
        <!-- Navigation -->
       <jsp:include page="menu.jsp"></jsp:include> 
        <div id="page-wrapper">
           <div class="dataTable_wrapper">
            <form id="myform" method="post" enctype="multipart/form-data">
                                <table class="table table-striped table-bordered table-hover" >
                                    <thead>
                                        <tr>
                                            <th>预览</th>
                                            <th>图片</th>
                                            <th>类别</th>
                                            <th>功能</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="gradeA">
                                            <td style="width:100px;height:100px"><a href="/instituteupload/${picture.link}">
                                            <img src="${pageContext.request.contextPath}/upload/${picture.link}" style="width:100px;height:100px"/></a></td>
                                            <td >重传： <input type="file" name="file"></td>
                                            <td>${picture.type}
                                            	<input type="hidden" name="link" value="${picture.link}">
                                            	<input type="hidden" name="id"  value="${picture.id}">  </td>
                                            <td><button class="btn btn-outline btn-success modify" >保存</button></td>
                                        </tr>
                                    </tbody>
                                </table>
                              </form>
                            </div>
        </div>
    </div>
  </body>
</html>
