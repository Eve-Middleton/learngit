<%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/2/14
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String stmj = (String) request.getAttribute("smj");
%>
面积为：
<%=stmj%>
</body>
</html>
