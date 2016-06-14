<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
      <div id="wrapper">
		<jsp:include page="menu.jsp"></jsp:include>
        <div id="page-wrapper">
          <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover" >
                                    
                                    <tbody>
                                        <tr class="gradeA">
                                            <td>论文名称：</td>
                                            <td><input name="title"></td>
                                        </tr>
                                         <tr class="gradeA">
                                            <td>论文作者：</td>
                                            <td><input name="author"></td>
                                        </tr>
                                        
                                         <tr class="gradeA">
                                            <td>论文关键字：</td>
                                            <td><input name="keyword"></td>
                                        </tr>
                                         <tr class="gradeA">
                                            <td>摘要：</td>
                                            <td><textarea name="summary" class="form-control" rows="5">lalalall</textarea></td>
                                        </tr>
                                         <tr class="gradeA">
                                            <td>论文内容：</td>
                                            <td><textarea name="content" class="form-control" rows="5">lalalall</textarea></td>
                                        </tr>
                                         <tr class="gradeA">
                                            <td>保存：</td>
                                            <td> <button type="button" class="btn btn-outline btn-warning modify">修改</button></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
          
        </div>
        <!-- /#page-wrapper -->
    </div>
  </body>
</html>
