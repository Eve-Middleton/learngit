<%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/2/16
  Time: 12:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.t1.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%
  Student stu1=new Student(19,"李芸妘");
  Student stu2=new Student(21,"张含韵");
  Student stu3=new Student(32,"李寻欢");

  List<Student> alist=new ArrayList<>();

  alist.add(stu1);
  alist.add(stu2);
  alist.add(stu3);

  session.setAttribute("alist",alist);
%>
</body>
</html>
