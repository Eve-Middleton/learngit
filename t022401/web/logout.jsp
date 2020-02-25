<%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/2/25
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="cancel.jsp" method="post">
    <table width="500" align="center">
        <caption><h2>注销页面</h2></caption>
        <caption><h3>请输入你要注销的账户和密码：</h3></caption>

        <tr>
            <td>手机号：</td>
            <td><input type="text" name="number"></td>
        </tr>

        <tr>
            <td>密码：</td>
            <td><input type="password" name="password1"></td>
        </tr>

        <tr>
            <td>重复密码：</td>
            <td><input type="password" name="password2"></td>
        </tr>

        <tr>
            <td align="center"><input type="submit" value="提交"></td>
            <td align="left"><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>
</body>
</html>
