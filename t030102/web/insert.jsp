<%@ page import="org.apache.commons.dbutils.*" %>
<%@ page import="com.mchange.v2.c3p0.ComboPooledDataSource" %><%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/3/1
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%
    String dbsql = "insert into student (name,age,total)values(?,?,?)";

    ComboPooledDataSource dataSource = new ComboPooledDataSource();//创建数据源

    QueryRunner queryRunner = new QueryRunner(dataSource);
    queryRunner.update(dbsql,"李沁",29,900);
    out.print("添加成功！");

%>
</body>
</html>
