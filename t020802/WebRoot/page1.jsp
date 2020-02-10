<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head></head>
<body>
	网页page1
	<br />
	<%
		int m = 10;
		int n = 20;
		int k = m + n;
		//pageContext.setAttribute("属性名", 对象);
		//当前页共享数据
		//第二个参数只能放对象，不能放基本型(int,double,String)

		//pageContext.setAttribute("num", k + "");//此时对象为String 共享数据

		//String str = (String) pageContext.getAttribute("num");
		//未转前类型为object型(一切类的父类)，需要向下转型  ！获取数据
	%>

	<%-- 	值为：<%=str%>
 --%>
	<%
		request.setAttribute("mj", k + "");
		//一次请求共享
		//request.getRequestDispatcher("page2.jsp").forward(request, response);//服务器跳转
		//String st = (String) request.getAttribute("mj");
	%>
	<%
		request.setAttribute("mj", k + "");
		response.sendRedirect("page2.jsp");//客户端跳转
		//此时无法获取到值，客户端跳转产生新的请求，第一个request存放数据，第二个request无数据。
	%>
</body>
</html>
