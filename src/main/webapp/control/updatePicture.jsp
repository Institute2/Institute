<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
     <div id="wrapper">
        <!-- Navigation -->
       <jsp:include page="menu.jsp"></jsp:include> 
        <div id="page-wrapper">
           <div class="dataTable_wrapper">
           <form action="">
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
                                            <td style="width:100px;height:100px"><img src="5.jpg" style="width:100px;height:100px"/></td>
                                            <td >重传： <input type="file"></td>
                                            <td></td>
                                            <td> <input type="submit" class="btn btn-outline btn-success" value="保存" /></td>
                                        </tr>
                                    </tbody>
                                </table>
                              </form>
                            </div>
        </div>
    </div>
  </body>
</html>
