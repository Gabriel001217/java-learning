<%@ page import="java.util.List" %>
<%@ page import="com.gabriel.pojo.Order" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/11/27
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Order> orderList= (List<Order>) request.getAttribute("orderList");
    if (orderList!=null){
        application.setAttribute("orderList", orderList);
    }else {
        orderList= (List<Order>) application.getAttribute("orderList");
    }
%>
<h2 align="center">订单信息</h2>
<table border="1px" align="center" width="80%">
    <tr>
        <td>序号</td>
        <td>用户名</td>
        <td>商品名</td>
        <td>购买数量</td>
        <td>购买时间</td>
        <td>订单金额</td>
    </tr>
    <%
        int i=0;
        for (Order order : orderList) {
            i++;
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
            String buytime=simpleDateFormat.format(order.getBuytime());
    %>
    <tr>
        <td><%=i%></td>
        <td><%=order.getUsername()%></td>
        <td><%=order.getItemname()%></td>
        <td><%=order.getNumber()%></td>
        <td><%=buytime%></td>
        <td><%=order.getTotal()%></td>
    </tr>
    <%
        }
    %>
</table>
<p align="center"><a href="${pageContext.request.contextPath}/manager.action">返回上一级</a></p>
</body>
</html>
