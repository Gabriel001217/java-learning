<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/8
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1  align="center" style="color: red;">用户名或密码错误，请重新登录！</h1>
<%
    response.setHeader("refresh", "5;URL=index.jsp");
%>
<h2 align="center">五秒后跳转回登陆页面，否则点击<a href="index.jsp">这里</a>跳转</h2>
</body>
</html>
