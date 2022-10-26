<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/11/26
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>管理员系统</h2>
<ul>
    <li>
        <a href="${pageContext.request.contextPath}/order.action">查看订单信息</a>
    </li>
    <li>
        <a href="${pageContext.request.contextPath}/item.action">查看产品信息</a>
    </li>
    <li>
        <a href="${pageContext.request.contextPath}/user.action">查看用户信息</a>
    </li>
</ul>
</body>
</html>
