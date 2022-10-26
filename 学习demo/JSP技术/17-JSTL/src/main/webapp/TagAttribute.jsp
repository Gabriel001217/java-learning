<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/25
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    boolean gender=true;
    pageContext.setAttribute("gender", gender);
%>
<ct:if test="${gender}">男</ct:if>
<ct:if test="${not gender}">女</ct:if>
</body>
</html>
