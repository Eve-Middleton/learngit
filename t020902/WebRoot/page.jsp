<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
<form action="text.jsp" method="post">
矩形第一条边<input type="text" name="number1">厘米<br/>
矩形第二条边<input type="text" name="number2">厘米<br/>
<input type="submit" value="确定"></form>
</body>
</html>
