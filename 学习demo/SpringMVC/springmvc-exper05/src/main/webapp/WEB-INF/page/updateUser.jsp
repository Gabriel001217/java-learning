<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/11/27
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
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
<h2 align="center">更新用户信息</h2>
<form action="${pageContext.request.contextPath}/doUserUpdate.action" method="get">
    用户名：<input type="text" value="${user.username}" name="username" readonly><br>
    真实姓名：<input type="text" value="${user.realname}" name="realname"><br>
    密码：<input type="text" value="${user.password}" name="password"><br>
    手机号：<input type="text" value="${user.phone}" name="phone"><br>
    <input type="submit" value="修改" id="sub">
    <input type="reset" value="重置">
</form>
</body>
</html>
