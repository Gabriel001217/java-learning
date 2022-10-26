<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/17
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    int sum=0;
    int max(int a,int b){
        return a>b?a:b;
    }
%>
<h1>hello world</h1>
<%
    int local=3;
    local++;
    sum++;
%>
sum:<%=sum%><br>
local:<%=local%><br>
<%=max(sum, local)%>
</body>
</html>
