<%@ page import="com.mchange.v2.c3p0.*" %>
<%@ page import="org.apache.commons.dbutils.QueryRunner" %>
<%@ page import="org.apache.commons.dbutils.handlers.BeanHandler" %>
<%@ page import="com.t1.domain.Student" %><%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/3/1
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String dbsql = "select * from student where name=? and age=?";
    ComboPooledDataSource dataSource = new ComboPooledDataSource();//创建数据源

    QueryRunner queryRunner = new QueryRunner(dataSource);
    BeanHandler beanHandler = new BeanHandler<Student>(Student.class);
    Student stu = (Student) queryRunner.query(dbsql, beanHandler,"李沁",29);
try {
    out.print(stu.getId());
    out.print(stu.getName());
    out.print(stu.getAge());
    out.print(stu.getTotal());
}catch (Exception e){
    out.print("查询内容为空！");
}
%>
</body>
</html>
