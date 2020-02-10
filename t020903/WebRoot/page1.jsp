<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  <body>
  <form action="page2.jsp" method="post">
  半径r：<input type="text" name="bj"><br/>
    高&nbsp&nbsph：<input type="text" name="g"><br/>
  <input type="submit" value="提交">
  </form>
  </body>
</html>
