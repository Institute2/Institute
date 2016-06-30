<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
response.setContentType("text/html;charset=UTF-8");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<title>研究所后台管理页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="${pageContext.request.contextPath}/control/css/bootstrap.min.css" rel="stylesheet">
    <!-- MetisMenu CSS -->
    <link href="${pageContext.request.contextPath}/control/css/metisMenu.min.css" rel="stylesheet">
    <!-- DataTables CSS -->
    <link href="${pageContext.request.contextPath}/control/css/dataTables.bootstrap.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/control/css/sb-admin-2.css" rel="stylesheet">
    <!-- Custom Fonts -->
    <link href="${pageContext.request.contextPath}/control/css/font-awesome.min.css" rel="stylesheet" type="text/css">
     <script src="${pageContext.request.contextPath}/control/js/jquery.min.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="${pageContext.request.contextPath}/control/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="${pageContext.request.contextPath}/control/js/metisMenu.min.js"></script>

    <!-- DataTables JavaScript -->
    <script src="${pageContext.request.contextPath}/control/js/jquery.dataTables.min.js"></script>
    <script src="${pageContext.request.contextPath}/control/js/dataTables.bootstrap.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="${pageContext.request.contextPath}/control/js/sb-admin-2.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
                responsive: true
        });
    });
    </script>
  </head>
  
  <body>
     <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">研究所后台管理系统</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                   		王永老师欢迎您！ 
       
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                  <a class="text-center" href="#">
                       <strong>退出登录</strong>
                      	<i class="fa fa-angle-right"></i>
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->
            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li>
                            <a href="${pageContext.request.contextPath}/control/index.jsp"><i class="fa fa-dashboard fa-fw"></i>首页</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/control/news/getNews.do"><i class="fa fa-dashboard fa-fw"></i>新闻动态</a>
                        </li>
                        <li>
                            <a href="papaers.jsp"><i class="fa fa-dashboard fa-fw"></i>论文专著</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-dashboard fa-fw"></i>研究所</a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="${pageContext.request.contextPath}/control/leader/getLeaders.do">学术带头人</a>
                                </li>
                                <li>
                                    <a href="${pageContext.request.contextPath}/control/member/getMembers.do">成员介绍</a>
                                </li>
                                 <li>
                                    <a href="${pageContext.request.contextPath}/control/grad/getGrads.do">已毕业成员</a>
                                </li>
                            </ul>
                        </li>
                          <li>
                            <a href="#"><i class="fa fa-dashboard fa-fw"></i>研究成果</a>
                             <ul class="nav nav-second-level">
                                <li>
                                    <a href="${pageContext.request.contextPath}/control/doingProject/getDoingProjects.do">在研项目</a>
                                </li>
                                <li>
                                    <a href="${pageContext.request.contextPath}/control/doneProject/getDoneProjects.do">已完成项目</a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/control/department/getDepartments.do"><i class="fa fa-dashboard fa-fw"></i>相关单位</a>
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>
  </body>
</html>