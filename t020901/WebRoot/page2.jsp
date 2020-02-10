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
	<%
		request.setCharacterEncoding("utf-8");
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		request.setAttribute("numo", str1);
		request.setAttribute("numt", str2);
		request.getRequestDispatcher("page3.jsp").forward(request, response);
	%>
</body>
</html>
