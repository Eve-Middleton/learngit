<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	<h1>矩形求面积</h1>
		第一条边<input type="text" name="number1"><br> 
		第二条边<input type="text" name="number2"><br> 
				<input type="submit" value="面积">
	</form>
</body>
</html>
