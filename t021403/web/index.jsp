<%@ page import="com.t1.DAOPAI.StudnetDAOPAI" %>
<%@ page import="com.t1.student.Student" %>
<%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/2/14
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%
    Student sut = new Student();
    sut.setName("李青云");
    sut.setAge(19);
    sut.setTotal(950);

    StudnetDAOPAI stud = new StudnetDAOPAI();
    stud.insert(sut);
/*
    stud.delete(8);
*/
%>
<%="添加成功！"
%>
</body>
</html>
