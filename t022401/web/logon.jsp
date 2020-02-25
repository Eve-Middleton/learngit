<%--
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
<body>
<form action="result.jsp" method="post">
    <table width="600" align="center">
        <caption><h2>注册页面</h2></caption>
        <tr>
            <td width="100">昵称：</td>
            <td><input type="text" name="name"></td>
        </tr>

        <tr>
            <td width="100">手机号：</td>
            <td><input type="text" name="number"></td>
        </tr>

        <tr>
            <td width="100">密码：</td>
            <td><input type="password" name="password"></td>
        </tr>

        <tr>
            <td align="center"><input type="submit" value="提交"></td>
            <td align="left"><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>
</body>
</html>
