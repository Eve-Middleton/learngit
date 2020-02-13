<%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/2/13
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.t1.*" import="com.t2.*"
         import="java.sql.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String strid = request.getParameter("id");
    int intid = Integer.parseInt(strid);

    MyData mdata = new MyData();
    student stu2 = mdata.select(intid);
%>
<%= stu2.getName()%>
<%=stu2.getAge()%>
<%=stu2.getTotal()%>
</body>
</html>
