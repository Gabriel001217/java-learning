<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/16
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--EL表达式中pageContext最常用的写法--%>
<form action="${pageContext.request.contextPath}/regist" method="post">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    <input type="submit" value="注册">
</form>

<%--获取初始化参数--%>
<%--其底层实际调用的是：servletContext.getInitParamter()--%>
company=${initParam.company}<br>
address=${initParam.address}<br>
</body>
</html>
