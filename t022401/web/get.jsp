<%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/2/25
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    boolean result = (boolean) request.getAttribute("qresult");
    System.out.println(result);
    if (result == true) {
        out.print("登陆成功！");
    } else {
        out.print("账号或密码错误！");
    }
%>

</body>
</html>
