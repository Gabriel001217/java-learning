<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="com.gabriel.pojo.Item" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/11/25
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Item item= (Item) request.getAttribute("item");
%>
<form action="${pageContext.request.contextPath}/update.action" method="get">
    序号：<input type="text" name="id" value="<%=item.getId()%>" readonly><br>
    商品名称：<input type="text" name="name" value="<%=item.getName()%>"><br>
    商品价格：<input type="text" name="price" value="<%=item.getPrice()%>"><br>
    生产日期：<input type="text" name="onDay" value="<fmt:formatDate value="${item.onDay}" pattern="yyy-MM-dd"/>"><br>
    商品描述：<input type="text" name="detail" value="<%=item.getDetail()%>"><br>
    <input type="submit" value="修改">
    <input type="reset" value="重置">
</form>
</body>
</html>
