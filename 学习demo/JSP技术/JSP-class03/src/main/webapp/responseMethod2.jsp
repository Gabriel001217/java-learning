<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/24
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<body>
<!--禁用缓存-->
<%

    //response.setHeader("Cache-Control", "no-store");
    //response.setDateHeader("Expires", 0);
    response.setHeader("refresh", "5;URL=registForm.jsp");
    //response.setHeader("refresh", "5;URL=login.jsp");
%>

<h1>5秒后跳转，否则点击<a href="registForm.jsp">这里</a>跳转</h1>
</body>
</body>
</html>
