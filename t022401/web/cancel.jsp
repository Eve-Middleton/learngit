<%@ page import="com.t1.dao.impl.UserDAOlmpl" %><%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/2/25
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8");

    String number = request.getParameter("number");
    String password1 = request.getParameter("password1");
    String password2 = request.getParameter("password2");
    UserDAOlmpl umpl = new UserDAOlmpl();

    if (password1.equals(password2)) {
        boolean reslet = umpl.delect(number);
        if (reslet == true) {
            out.print("删除成功！");
        } else {
            out.print("账户不存在，请检查你的手机号和密码！");
        }
    } else {
        out.print("两次输入的密码不一致，请检查！");
    }
%>

</body>
</html>
