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
	This is my page.
	<br />
	<%
		String str1 = request.getParameter("x");
		String str2 = request.getParameter("y");
		out.println(str1); 
		out.println(str2);
	%>
	<br>x=<%=str1 %>
</body>
</html>
