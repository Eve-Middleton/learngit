<%@ page import="com.mchange.v2.c3p0.ComboPooledDataSource" %>
<%@ page import="org.apache.commons.dbutils.QueryRunner" %>
<%@ page import="org.apache.commons.dbutils.handlers.ScalarHandler" %><%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/3/1
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String sql = "select count(*) from student";

    ComboPooledDataSource dataSource = new ComboPooledDataSource();
    QueryRunner queryRunner = new QueryRunner(dataSource);

    ScalarHandler scalarHandler = new ScalarHandler(1);
    Long countl = (Long) queryRunner.query(sql, scalarHandler);//必须向下转型为Long型后，再调用intvalue()方法转为int
    int count = countl.intValue();
%>
总人数为：
<%= count%>
</body>
</html>
