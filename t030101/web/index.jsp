<%@ page import="java.sql.*" %>
<%@ page import="com.mchange.v2.c3p0.*" %><%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/3/1
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%
    String dbsql = "select * from student where id=?";

  ComboPooledDataSource dataSource = new ComboPooledDataSource();//创建数据源
  Connection conn = dataSource.getConnection();

  PreparedStatement pstmt = conn.prepareStatement(dbsql);
  pstmt.setInt(1, 2);
  ResultSet rs = pstmt.executeQuery();

  if (rs.next()) {
    int id = rs.getInt(1);
    String name = rs.getString(2);
    int age = rs.getInt(3);
    double total = rs.getDouble(4);

    out.println(id + " " + name + " " + total);
  }
  rs.close();
  pstmt.close();
  conn.close();
%>
</body>
</html>
