<%@ page import="java.util.Enumeration" %>
<%@ page import="com.study.container.GoodsBean" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.math.BigDecimal" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/29
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    BigDecimal total=new BigDecimal("0");
%>
<h1>购物车</h1>
<table border="1">
    <tr style="font-weight: bold">
        <td>序号</td>
        <td>商品</td>
        <td>价格</td>
        <td>数量</td>
        <td>小计</td>
    </tr>
    <%
        GoodsBean goodsBean=new GoodsBean();
        ArrayList<Map<String,Object>> lst=goodsBean.getLst();
        Enumeration<String> names=application.getAttributeNames();
        while (names.hasMoreElements()){
            String name=names.nextElement();
            String num = String.valueOf(application.getAttribute(name));
            for (Map<String, Object> item : lst) {
                if(item.get("quantity").equals(name)&&!"0".equals(num)){
    %>
    <tr>
        <td><%=(int)item.get("no")%></td>
        <td><%=(String) item.get("name")%></td>
        <td><%=(double)item.get("price")%></td>
        <td><%=num%></td>
    <%
        BigDecimal deA=new BigDecimal(num);
        BigDecimal deB=new BigDecimal(item.get("price").toString());
        BigDecimal money=deA.multiply(deB);
        total=total.add(money);
    %>
        <%--<td><%=Double.parseDouble(num)*((double)item.get("price"))%></td>--%>
        <td><%=money%></td>
    </tr>
    <%            }
            }
        }
    %>
    <tr>
        <td colspan="4">总计</td>
        <td><%=total%></td>
    </tr>
</table>
<br>
<a href="shoppingcar.jsp">返回商品列表继续购物</a>
</body>
</html>
