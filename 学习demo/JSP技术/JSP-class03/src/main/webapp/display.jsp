<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/24
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>display</title>
</head>
<body>
<h1>Display!</h1>
<%
    request.setCharacterEncoding("utf-8");
    String username = request.getParameter("name");
    String password = request.getParameter("pass");
    String sex = request.getParameter("sex");
    String xueli = request.getParameter("xueli");
    String[] xqs = request.getParameterValues("interest");
    String xq="";
    for(String s:xqs){
        xq+=(s+",");
    }
%>
用户名：<%=username%>
密码：<%=password%>
性别:<%=sex%>
学历:<%=xueli%>
兴趣:<%=xq%>
</body>
</html>
