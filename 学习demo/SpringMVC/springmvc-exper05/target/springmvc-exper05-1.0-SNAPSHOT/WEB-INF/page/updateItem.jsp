<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/11/27
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <script>
        window.onload = function () {
            var btn = document.getElementById("sub")
            btn.onclick = function () {
                alert("修改成功！");
            }
        }
    </script>
</head>
<body>
<h2 align="center">更新商品</h2>
<form action="${pageContext.request.contextPath}/doItemUpdate.action" method="get">
    商品序号：<input type="text" value="${item.id}" name="id" readonly><br>
    商品名称：<input type="text" value="${item.name}" name="name"><br>
    商品价格：<input type="text" value="${item.price}" name="price"><br>
    生产日期：<input type="date"  name="onDay" value="<fmt:formatDate value="${item.onDay}" pattern="yyy-MM-dd"/>"><br>
    商品描述：<input type="text" value="${item.detail}" name="detail"><br>
    <input type="submit" value="修改" id="sub">
    <input type="reset" value="重置">
</form>
</body>
</html>
