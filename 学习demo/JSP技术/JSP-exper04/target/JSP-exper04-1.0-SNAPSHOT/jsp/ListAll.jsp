<%@ page import="java.util.Map" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.text.DateFormat" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/9
  Time: 0:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
   Map<String,HttpSession> map= (Map<String, HttpSession>) application.getAttribute("user");
%>
<table border="1">
    <tr>
        <td>用户名</td>
        <td>登陆时间</td>
        <td>最近活跃时间</td>
        <td>失效时间</td>
        <td>操作</td>
    </tr>
    <%
        Iterator<String> iter = map.keySet().iterator();
        while(iter.hasNext()){
            String key=iter.next();
            DateFormat dateFormat = DateFormat.getDateTimeInstance();
            String date = dateFormat.format(map.get(key).getAttribute("date"));
            String quitURL=request.getContextPath()+"/kick?username="+key;
    %>
    <tr>
        <td><%=key%></td>
        <td><%=date%></td>
        <td><%=date%></td>
        <td><%=session.getMaxInactiveInterval()%></td>
        <td><a href=<%=quitURL%>>踢出</a></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
