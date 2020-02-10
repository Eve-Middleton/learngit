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
	<!--  -->
	<%-- --%>
	第一
	<br />
	<%
		int m = 6;
		int n = 4;
	%>
	<a href="page.jsp?x=<%=m%>&<%=n%>">点此跳转</a> <!-- 非Java代码传递变量 -->
	<!--标签——第一种跳转方式：重定向 。产生两次请求-->

	<%--  <jsp:forward page="page.jsp?x=6&y=2"></jsp:forward> //页面跳转时传递常量 --%>
	<!--动作——第二种跳转方式：转发。不产生新的请求 -->

	<%-- <%response.sendRedirect("page.jsp?x=4&y=5");%>//页面跳转时传递常量 --%>
	<%--Java代码——第三种跳转方式：重定向跳转。产生一次新的请求，当前页与目标页使用不同的request对象 --%>

	<%-- <%
		int a = 4;
		int b = 5;
		request.getRequestDispatcher("page.jsp?x=" + a + "&y=" + b).forward(request, response);//页面跳转时传递变量
	%> --%>
	<%--Java代码——第四种跳转方式：转发跳转。不产生新的请求，同用一个request对象 --%>
</body>
</html>
