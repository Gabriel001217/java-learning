<%@page import="com.study.container.BookInfo" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="bookinfo" class="com.study.container.BookInfo" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("utf-8");
        %>
        <jsp:setProperty name="bookinfo" property="*"/>
            <%--<jsp:setProperty name="bookinfo" property="name" param="name" />
            <jsp:setProperty name="bookinfo" property="isbn" param="isbn" />
            <jsp:setProperty name="bookinfo" property="price" param="price" />
            <jsp:setProperty name="bookinfo" property="paginalNumber" param="paginalNumber" />  --%>
        <!--xxxxxx-->
        <p>您输入的书籍信息如下(3)：</p>
        <p>书名：<jsp:getProperty name="bookinfo" property="name"/></p>
        <p>书号：<jsp:getProperty name="bookinfo" property="isbn"/></p>
        <p>价钱：<jsp:getProperty name="bookinfo" property="price"/></p>
        <p>页数：<jsp:getProperty name="bookinfo" property="paginalNumber"/></p>
    </body>
    </html>