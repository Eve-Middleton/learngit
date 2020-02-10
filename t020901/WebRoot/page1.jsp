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
	<form action="page2.jsp" method="post">
		数字1 <input type="text" name="num1"> <br /> 
		数字2 <input type="text" name="num2"> <br /> 
		<input type="submit" value="求和">
	</form>
</body>
</html>
