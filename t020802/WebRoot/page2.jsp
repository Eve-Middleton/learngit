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
	page2<br/>
	<%
	request.setCharacterEncoding("utf-8");
	String st = (String) request.getAttribute("mj");
%>
	数字:<%=st%>

</body>
</html>
