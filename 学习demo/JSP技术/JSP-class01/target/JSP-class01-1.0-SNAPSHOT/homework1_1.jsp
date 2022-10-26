<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/17
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>homework</title>
</head>
<body>
<table border="1">
    <tr>
        <td>&nbsp;</td>
        <%
            for (int i=1;i<=9;i++){
        %>
        <td><%=i%></td>
        <%
            }
        %>
    </tr>
    <%
        for (int i=1;i<=9;i++){
    %>
    <tr>
        <td><%=i%>&nbsp;&nbsp;</td>
        <%
            for (int j=1;j<=i;j++){
        %>
        <td><%=i%>&nbsp;*&nbsp;<%=j%>&nbsp;=&nbsp;<%=i*j%></td>
        <%
            }
        %>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
