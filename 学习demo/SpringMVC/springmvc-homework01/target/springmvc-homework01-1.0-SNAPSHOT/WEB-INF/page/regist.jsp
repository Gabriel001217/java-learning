<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/11/25
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        form{
            font-size: 30px;
            line-height: 30px;
        }
    </style>
</head>
<body>
<h1>注册</h1>
<form action="${pageContext.request.contextPath}/login.action" method="post">
    用户名：<input type="text" name="username"><br>
    真实姓名：<input type="text" name="realname"><br>
    密码：<input type="password" name="password"><br>
    电话号码：<input type="number" name="phone"><br>
    <input type="submit" name="提交">
    <input type="reset" name="重置">
</form>
</body>
</html>
