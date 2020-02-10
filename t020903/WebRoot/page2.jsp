<%@ page language="java" import="java.util.*" import="com.t1.*"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

</head>
<body>

	<%
		request.setCharacterEncoding("utf-8");
		double r = Integer.parseInt(request.getParameter("bj"));
		double h = Integer.parseInt(request.getParameter("g"));

		Count con = new Count();
		double dmj = con.getDimianji(r);
		double tj = con.getTiji(r, h);

		/* out.println("底面积："+dmj);
		out.println("体积："+tj); */
	%>
		<table border="1">
		<tr>
			<td>底面积</td>
			<td>&nbsp<%=dmj%>&nbsp</td>
		</tr>
		<tr>
			<td>体&nbsp&nbsp&nbsp积</td>
			<td>&nbsp<%=tj%>&nbsp</td>
		</tr>
	</table>
</body>
</html>
