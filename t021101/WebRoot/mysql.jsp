<%@ page language="java" import="java.util.*" import="java.sql.*"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html>
<head>
</head>
<body>
	<%
		try {
			out.println("这是第一行");
			out.println("<br/>");
			String uname = request.getParameter("name");
			String uage = request.getParameter("age");
			int unage = Integer.parseInt(uage);

			String unum = request.getParameter("num");
			double unnum = Double.parseDouble(unum);
			out.println(uname + "," + uage + "," + unum);
			String sql = "INSERT INTO student (name,age,total) " + "VALUES('" + uname + "'," + unage + "," + unnum
					+ ")";
			out.println(sql);
			out.println("<br/>");
			Class.forName("com.mysql.jdbc.Driver");
			out.println("数据库驱动加载成功");
			out.println("<br/>");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classmate", "root", "root");
			out.println("数据库连接成功");
			out.println("<br/>");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			out.println("添加成功！");
			out.println("<br/>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	%>

</body>
</html>
