<%@ page import="com.t1.StudentDAOIpml" %>
<%@ page import="java.util.List" %>
<%@ page import="com.DAO.Ipml.Student" %><%--
  Created by IntelliJ IDEA.
  User: 胡朝辉
  Date: 2020/2/13
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>查询系统</title>
  </head>
  <body>
  <%
    StudentDAOIpml stup=new StudentDAOIpml();
    List<Student> list=stup .querryAll();

    for(Student st:list){
      String sprint=st.getId()+" "+st.getName()+" "+st.getAge()+" "+st.getTotal()+"<br>";
      out.print(sprint);
    }
  %>
  </body>
</html>
