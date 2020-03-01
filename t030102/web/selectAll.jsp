<%@ page import="com.mchange.v2.c3p0.ComboPooledDataSource" %>
<%@ page import="org.apache.commons.dbutils.QueryRunner" %>
<%@ page import="org.apache.commons.dbutils.handlers.BeanListHandler" %>
<%@ page import="com.t1.domain.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/3/1
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String sql = "select * from student";
    ComboPooledDataSource dataSource = new ComboPooledDataSource();

    QueryRunner queryRunner = new QueryRunner(dataSource);

    BeanListHandler beanListHandler = new BeanListHandler<Student>(Student.class);
    List<Student> list =(List<Student>) queryRunner.query(sql, beanListHandler);

    for (Student stu : list) {
        out.print(stu.getId()+"&nbsp;");
        out.print(stu.getName()+"&nbsp;");
        out.print(stu.getAge()+"&nbsp;");
        out.print(stu.getTotal()+"<br/>");
    }
%>

</body>
</html>
