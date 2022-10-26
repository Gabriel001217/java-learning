<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/18
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .top{
            border: 1px solid blue;
            height: 100px;
            width: auto;
        }
        .left{
            border: 1px solid blue;
            height: 550px;
            width: 350px;
            float: left;
        }
        .right{
            border: 1px solid red;
            height: 550px;
            width: 1149px;
            float: right;
        }
        .bottom{
            border: 1px solid blue;
            height: 50px;
            width: auto;
            overflow: hidden;
        }
    </style>
</head>
<body>
<div class="top">
    <%
        double random=Math.random();
    %>
    <jsp:include page="page01.jsp" flush="true">
        <jsp:param name="random" value="<%=random%>"></jsp:param>
    </jsp:include>
</div>
<div class="left">
    <jsp:include page="page02.jsp" flush="true"></jsp:include>
</div>
<div class="right">
    <jsp:include page="page03.jsp" flush="true"></jsp:include>
</div>
<div class="bottom">
    <jsp:include page="page04.jsp" flush="true"></jsp:include>
</div>
</body>
</html>
