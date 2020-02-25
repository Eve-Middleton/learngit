<%@ page import="com.t1.dao.impl.UserDAOlmpl" %><%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/2/24
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body><%
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
    String number = request.getParameter("number");
    String password = request.getParameter("password");

    UserDAOlmpl udm = new UserDAOlmpl();
    udm.insertUser(name, number, password);
%>
<table align="center">
    <caption><h2>注册成功！</h2></caption>
    <tr>
        <td>你的昵称为：</td>
        <td><%=name%>
        </td>
    </tr>
    <tr>
        <td>你的手机号为：</td>
        <td><%=number%>
        </td>
    </tr>
    <tr>
        <td>你的密码为：</td>
        <td><%=password%>
        </td>
    </tr>

</table>
</body>
</html>
