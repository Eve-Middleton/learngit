<%@ page language="java" import="java.util.*" import="com.t1.*"
	pageEncoding="utf-8"%>
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
		if ("".equals(request.getParameter("number1")) || "".equals(request.getParameter("number2"))) {
			out.println("请输入完整的数据！");
		} else {

			double num1 = Double.parseDouble(request.getParameter("number1"));
			double num2 = Double.parseDouble(request.getParameter("number2"));

			JuXing cou = new JuXing();
			double s = cou.getSum(num1, num2);
			out.println("矩形面积为：" + s + "cm²");
		}
	%>
</body>
</html>
