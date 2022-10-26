<%@ page import="java.io.Writer" %>
<%@ page import="java.io.StringWriter" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/30
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>出错了</title>
</head>
<body>
<h1>
    <p style="color: red;">错误描述：<%=exception.getMessage()%></p>
    <br>产生错误调用堆栈：</br>
    <%
        String exceptioninfo;
        Writer w=new StringWriter();
        exception.printStackTrace(new PrintWriter(w));
        exceptioninfo=w.toString();
    %>
    <%=exceptioninfo.replaceAll("\n", "</br>")%>
    </p>
</h1>
</body>
</html>
