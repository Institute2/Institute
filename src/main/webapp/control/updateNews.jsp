<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
   <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover" >
                                    <tbody>
                                        <tr class="gradeA">
                                            <td>新闻标题：</td>
                                            <td><input name="title"></td>
                                        </tr>
                                         <tr class="gradeA">
                                            <td>新闻发布者：</td>
                                            <td> <select>
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                            </select>
                                            </td>
                                        </tr>
                                         <tr class="gradeA">
                                            <td>新闻摘要：</td>
                                            <td><textarea name="summary" class="form-control" rows="5"></textarea></td>
                                        </tr>
                                         <tr class="gradeA">
                                            <td>新闻内容：</td>
                                            <td><textarea name="content" class="form-control" rows="5"></textarea></td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>保存：</td>
                                            <td> <button type="button" class="btn btn-outline btn-warning modify">修改</button></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
  </body>
</html>
