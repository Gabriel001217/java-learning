<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/12/14
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="carinfo" class="com.study.container.Car"></jsp:useBean>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
%>
<jsp:setProperty name="carinfo" property="*"/>
<%--<jsp:setProperty name="bookinfo" property="name" param="name" />
<jsp:setProperty name="bookinfo" property="isbn" param="isbn" />
<jsp:setProperty name="bookinfo" property="price" param="price" />
<jsp:setProperty name="bookinfo" property="paginalNumber" param="paginalNumber" />  --%>
<!--xxxxxx-->
<p>您输入的书籍信息如下(3)：</p>
<p>书名：<jsp:getProperty name="carinfo" property="brand"/></p>
<p>书号：<jsp:getProperty name="carinfo" property="id"/></p>
<p>价钱：<jsp:getProperty name="carinfo" property="price"/></p>
<p>页数：<jsp:getProperty name="carinfo" property="seats"/></p>
</body>
</html>
