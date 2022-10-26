<%@ page import="java.util.List" %>
<%@ page import="com.gabriel.pojo.Item" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/11/26
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        window.onload=function(){
            var btn=document.getElementsByName("buy");
            for (var i=0;i<btn.length;i++){
                btn[i].onclick=function () {
                    alert("购买成功！");
                }
            }
        }
    </script>
</head>
<body>
<%
    List<Item> itemList = (List<Item>) request.getAttribute("itemList");
    String username= (String) request.getAttribute("username");
    if (itemList!=null){
        application.setAttribute("itemList", itemList);
        application.setAttribute("username", username);
    }else {
        itemList= (List<Item>) application.getAttribute("itemList");
        username= (String) application.getAttribute("username");
    }

%>
<table border="1" width="80%" align="center">
    <tr>
        <td align="center" colspan="6" height="40px" style="font-size: 20px">商品信息</td>
    </tr>
    <tr>
        <td>商品序号</td>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>生产日期</td>
        <td>商品描述</td>
        <td>操作</td>
    </tr>
    <%
        for (Item item : itemList) {
            String onDay=new SimpleDateFormat("yyy-MM-dd").format(item.getOnDay());
    %>
    <tr>
        <td><%=item.getId()%></td>
        <td><%=item.getName()%></td>
        <td><%=item.getPrice()%></td>
        <td><%=onDay%></td>
        <td><%=item.getDetail()%></td>
        <td>
            <form action="${pageContext.request.contextPath}/purchase.action" method="get">
                <input type="hidden" value="<%=username%>" name="username">
                <input type="hidden" value="<%=item.getName()%>" name="itemName">
                <input type="number" value="1" name="number">
                <input type="hidden" value="<%=item.getPrice()%>" name="price">
                <input type="submit" value="购买" name="buy">
            </form>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
