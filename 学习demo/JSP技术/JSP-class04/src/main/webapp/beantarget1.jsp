<%@page import="com.study.container.BookInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            BookInfo book = new BookInfo();
            book.setIsbn("ISBN:1234567890");
            book.setName("JSP程序设计");
            book.setPaginalNumber(500);
            book.setPrice(68.50);
        %>
        <h1>图书信息</h1>
            <%=book.getIsbn()%>
        书名:<%=book.getName()%>
        页数:<%=book.getPaginalNumber()%>
        价格:<%=book.getPrice()%>
    </body>
    </html>
