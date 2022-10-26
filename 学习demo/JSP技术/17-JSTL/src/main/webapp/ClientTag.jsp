<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/25
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="ct" uri="http://www.gabriel.com/jsp/tags/custom"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String ip=request.getRemoteAddr();
    out.print("ip="+ip);
%>
<br>
<ct:clientIp/>

</body>
</html>
