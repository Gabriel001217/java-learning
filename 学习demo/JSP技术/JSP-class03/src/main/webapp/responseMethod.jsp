<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/24
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--禁用缓存-->
<%

    //response.setHeader("Cache-Control", "no-store");
    //response.setDateHeader("Expires", 0);
    response.setHeader("refresh", "1");
    //response.setHeader("refresh", "5;URL=login.jsp");
%>

<h1><%=new Date()%></h1>
</body>
</html>
