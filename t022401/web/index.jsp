<%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/2/25
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="UserServlet" method="post">
    <table width="400" align="center">
        <caption><h2>登陆系统</h2></caption>
        <tr>
            <td>手机号：</td>
            <td><input type="text" name="number"></td>
        </tr>

        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"></td>
        </tr>

        <tr>
            <td align="center"><input type="submit" value="登录"></td>
            <td align="left"><input type="reset" value="重置">
                <input type="button" value="注册" onclick="window.location.href='logon.jsp'">
                <input type="button" value="注销" onclick="window.location.href='logout.jsp'"></td>
        </tr>
    </table>
</form>

</body>
</html>
