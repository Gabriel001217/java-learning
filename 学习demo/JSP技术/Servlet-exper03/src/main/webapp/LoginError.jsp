<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/6
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>访问错误！</title>
</head>
<body>
<h1 align="center" style="color: red;">错误！请登录正确后再访问！</h1>
<%
    response.setHeader("refresh", "5;URL=Login.jsp");
%>
<h2 align="center">五秒后跳转回登陆页面，否则点击<a href="Login.jsp">这里</a>跳转</h2>
</body>
</html>
