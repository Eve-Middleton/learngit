<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head></head>
<body>
<form action="mysql.jsp" method="post">
姓名：<input type="text" name="name"><br/>
年龄：<input type="text" name="age"><br/>
数字：<input type="text" name="num"><br/>
<input type="submit" value="提交">
</form>
  </body>
</html>
