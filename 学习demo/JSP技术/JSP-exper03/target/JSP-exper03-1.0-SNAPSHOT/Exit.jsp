<%@ page import="com.study.container.EmployDAO" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/5
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    EmployDAO employDAO= (EmployDAO) session.getAttribute("EmployDAO");
    employDAO.CloseDBC();
%>
<body>
<h1>您已退出系统！</h1>
</body>
</html>
