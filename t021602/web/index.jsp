<%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/2/16
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>平均分查询</h1>
<form action="StudentServlet" method="post">
    请下拉选择你要查询的班级号： <SELECT name="banhao">
    <OPTION value="01">01</OPTION>
    <OPTION value="02">02</OPTION>
</SELECT>
    <input type="submit" value="确定">
</form>
</body>
</html>
