<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/8
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username= (String) session.getAttribute("username");
    String quitURL=request.getContextPath()+"/quit";
    String listURL=request.getContextPath()+"/jsp/ListAll.jsp";
%>
<a href=<%=quitURL%>>退出</a>
&nbsp;&nbsp;
<a href=<%=listURL%>>在线用户</a>
<h1>欢迎您，<%=username%></h1>
</body>
</html>
