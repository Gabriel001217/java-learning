<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/25
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CheckLogin</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    if ("Gabriel".equals(username)&&"123456".equals(password)){
        response.sendRedirect("success.jsp");
    }else {
        response.sendRedirect("failed.jsp");
    }
%>
</body>
</html>
