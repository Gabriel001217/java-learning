<%@ page import="java.util.List" %>
<%@ page import="com.gabriel.pojo.Item" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/11/25
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>查询条件：</p>
<table border="1" width="95%">
    <tr>
        <td>
            <form>
                <input type="button" value="查询">
            </form>
        </td>
    </tr>
</table>
<p>商品列表：</p>

<table border="1" width="95%">
    <tr>
        <td>序号</td>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>生产日期</td>
        <td>商品描述</td>
        <td>操作</td>
    </tr>
    <%
        List<Item> itemList= (List<Item>) request.getAttribute("itemList");
        for (Item item : itemList) {
            String onDay=new SimpleDateFormat("yyy-MM-dd").format(item.getOnDay());
    %>
    <tr>
        <td><%=item.getId()%></td>
        <td><%=item.getName()%></td>
        <td><%=item.getPrice()%></td>
        <td><%=onDay%></td>
        <td><%=item.getDetail()%></td>
        <td><a href="${pageContext.request.contextPath}/itemEdit.action?id=<%=item.getId()%>">修改</a></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
