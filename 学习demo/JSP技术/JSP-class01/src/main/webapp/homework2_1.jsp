<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/18
  Time: 12:47
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
    <%@ include file="file01.jsp"%>
</div>
<div class="left">
    <%@ include file="file02.jsp"%>
</div>
<div class="right">
    <%@ include file="file03.jsp"%>
</div>
<div class="bottom">
    <%@ include file="file04.jsp"%>
</div>
</body>
</html>
