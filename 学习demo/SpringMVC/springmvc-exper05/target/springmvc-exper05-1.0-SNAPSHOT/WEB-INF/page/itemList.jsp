<%@ page import="java.util.List" %>
<%@ page import="com.gabriel.pojo.Item" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/11/27
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script>
        window.onload = function () {
            var btn = document.getElementById("del")
            btn.onclick = function () {
                alert("删除成功！");
            }
        }
    </script>
</head>
<body>
<%
    List<Item> itemList= (List<Item>) request.getAttribute("itemList");
    if (itemList!=null){
        application.setAttribute("itemList", itemList);
    }else {
        itemList= (List<Item>) application.getAttribute("itemList");
    }
%>
<h2 align="center">产品信息</h2>
<table border="1px" align="center" width="80%">
    <tr>
        <td>商品序号</td>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>生产日期</td>
        <td>商品描述</td>
        <td colspan="2" align="center">操作</td>
    </tr>
    <%
        for (Item item : itemList) {
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyy-MM-dd");
            String onDay=simpleDateFormat.format(item.getOnDay());
    %>
    <tr>
        <td><%=item.getId()%></td>
        <td><%=item.getName()%></td>
        <td><%=item.getPrice()%></td>
        <td><%=onDay%></td>
        <td><%=item.getDetail()%></td>
        <td><a href="${pageContext.request.contextPath}/itemUpdate.action?id=<%=item.getId()%>&name=<%=item.getName()%>&price=<%=item.getPrice()%>&onday=<%=onDay%>&detail=<%=item.getDetail()%>">修改</a></td>
        <td><a href="${pageContext.request.contextPath}/itemDel.action?id=<%=item.getId()%>" id="del">删除</a></td>
    </tr>
    <%
        }
    %>
</table>
<p align="center"><a href="${pageContext.request.contextPath}/manager.action">返回上一级</a></p>
</body>
</html>
