<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/25
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int randNum= (int) session.getAttribute("randNumber");
    int number=Integer.parseInt(request.getParameter("number"));
    if (number>randNum){
%><h2><%=number%>大了</h2>
<%
    }else if(number<randNum){
%><h2><%=number%>小了</h2>
<%
    }else{
%><h2>答案：<%=number%>，恭喜你猜对了！</h2>
<%
        session.removeAttribute("randNumber");
    }
    response.setHeader("refresh", "3;URL=guess.jsp");
%><h2>2秒后跳转回去，否则点击<a href="guess.jsp">这里</a>跳转</h2>
</body>
</html>
