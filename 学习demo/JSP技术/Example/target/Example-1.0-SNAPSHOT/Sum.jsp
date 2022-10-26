<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/12/14
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
</body>
<%
    Random random=new Random();
    int num1=random.nextInt(100);
    int num2=random.nextInt(100);
    session.setAttribute("num1", num1);
    session.setAttribute("num2", num2);
%>
<form action="sum" method="get">
    <%=num1%>+<%=num2%>=<input type="text" name="answer"><br>
    <input type="submit" value="提交">
</form>
</html>
