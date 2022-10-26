<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/11/25
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录</h1>
<%
    if (request.getAttribute("flag")!=null){
        boolean flag= (boolean) request.getAttribute("flag");
        if (!flag){
%>
<p style="color:red;">用户名或密码错误！</p>
<%
        }
    }
%>
<form action="${pageContext.request.contextPath}/judge.action" method="post">
    用户名：<input type="text" name="username"><br>
    密码：<input type="password" name="password"><br>
    <input type="submit" value="登录">
    <input type="reset" value="重置">
</form>
</body>
</html>
