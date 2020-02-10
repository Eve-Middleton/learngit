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
		class clone {
			public int getSum(int nu1, int nu2) {
				int sum = nu1 + nu2;
				return sum;
			}
		}
	%>
	<%
		request.setCharacterEncoding("utf-8");
		String number1 = (String) request.getAttribute("numo");
		String number2 = (String) request.getAttribute("numt");

		int nu1 = Integer.parseInt(number1);
		int nu2 = Integer.parseInt(number2);
		
		clone cl = new clone();
		int num = cl.getSum(nu1, nu2);
		out.println("两数之和为：" + num);
	%>
</body>
</html>
