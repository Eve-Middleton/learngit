<%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/2/16
  Time: 12:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
%>
<c:forEach items="${alist}" var="var">
    id：${var.id} name:${var.name}<br/>
</c:forEach>
</body>
</html>
