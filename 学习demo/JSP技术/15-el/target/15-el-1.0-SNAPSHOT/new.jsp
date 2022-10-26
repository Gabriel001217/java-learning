<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/4
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String[] names={"张三","李四","王五"};
    pageContext.setAttribute("names", names);
%>
names[1]=${names[1]}<br>
<%--若访问的数组元素下标超出了数组下标上限，EL不会抛出越界异常--%>
names[5]=${names[5]}<br>
</body>
</html>
