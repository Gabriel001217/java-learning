<%@page import="com.study.container.BookInfo"%>
<jsp:useBean id="book" class="com.study.container.BookInfo" scope="application"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:setProperty name="book" property="name" value="Python" />
        <jsp:setProperty name="book" property="isbn" value="ISBN:9999" />
        <jsp:setProperty name="book" property="price" value="75" />
        <jsp:setProperty name="book" property="paginalNumber" value="100" />
        <h1>图书信息</h1>
        <p>书名：<jsp:getProperty name="book" property="name"/></p>
        <p>书号：<jsp:getProperty name="book" property="isbn"/></p>
        <p>价钱：<jsp:getProperty name="book" property="price"/></p>
        <p>页数：<jsp:getProperty name="book" property="paginalNumber"/></p>
    </body>
    </html>
