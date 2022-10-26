<%@ page import="com.study.container.EmployDAO" %>
<%@ page import="com.study.container.DatabaseConnectionUtil" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/5
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if (application.getAttribute("EmployDAO")==null){
        DatabaseConnectionUtil dbc=new DatabaseConnectionUtil();
        EmployDAO employDAO=new EmployDAO(dbc);
        application.setAttribute("EmployDAO", employDAO);
    }
%>
<h1 align="center">欢迎来到员工信息管理系统！</h1>
<hr width="auto">
<a href="ListAll.jsp">1 - 列出所有员工的信息</a><br>
<a href="FindByID.jsp">2 - 通过员工编号查找员工信息</a><br>
<a href="UpdateInfo.jsp">3 - 更新员工信息</a><br>
<a href="AddNew.jsp">4 - 增加一个新的员工</a><br>
<a href="DeleteOne.jsp">5 - 删除一个员工</a><br>
<a href="Exit.jsp">6 - 退出系统</a>
</body>
</html>
