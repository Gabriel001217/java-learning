<%@ page import="java.util.List" %>
<%@ page isELIgnored="false" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/14
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<String> names=new ArrayList<>();
    names.add("张三");
    names.add("李四");
    names.add("王五");
    pageContext.setAttribute("names", names);
%>
names[2]=${names[2]}<br>
names[200]=${names[200]}<br>
<%--EL没办法访问set--%>
</body>
</html>
