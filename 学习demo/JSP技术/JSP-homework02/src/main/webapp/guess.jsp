<%@ page import="java.util.Random" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/25
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>猜数游戏</title>
</head>
<body>
<%
    Integer count = (Integer)session.getAttribute("Count");
    Integer randNumber= (Integer) session.getAttribute("randNumber");
    if (randNumber==null){
        randNumber= new Random().nextInt(101);
        session.setAttribute("randNumber", randNumber);
    }
    out.print(session.getAttribute("randNumber"));
    if(count==null){
        count = 0;
    }else{
        count++;
    }
    session.setAttribute("Count", count);
%>
<form action="judge.jsp" method="post">
    请猜一个数字：<input type="text" name="number" placeholder="0~100内的整数"><br>
    <input type="submit" value="确定">
</form>
<p>已猜测次数:&nbsp;<%=count%>&nbsp;次</p>
</body>
</html>
