<%@ page import="java.util.Map" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.study.container.GoodsBean" %>
<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/29
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="errorPage.jsp" %>
<html>
<head>
    <title>Title</title>
    <style>
        .txt{
            font-weight: bold;
        }
    </style>
    <script>
        window.onload=function(){
            var btn=document.getElementsByName("sub");
            for (var i=0;i<btn.length;i++){
                btn[i].onclick=function () {
                    alert("添加到购物车成功！");
                }
            }
        }
    </script>
</head>
<%
    Integer countApp = (Integer)application.getAttribute("Count");
    if(countApp==null){
        countApp = 1;
    }else{
        countApp++;
    }
    application.setAttribute("Count", countApp);
%>
<%!
    int no;
    String name;
    double price;
    int quantity0;
    int quantity1;
    int quantity2;
    int quantity3;
%>
<%
    if (application.getAttribute("quantity0")==null){
        application.setAttribute("quantity0", 0);
    }
    if (application.getAttribute("quantity1")==null){
        application.setAttribute("quantity1", 0);
    }
    if (application.getAttribute("quantity2")==null){
        application.setAttribute("quantity2", 0);
    }
    if (application.getAttribute("quantity3")==null){
        application.setAttribute("quantity3", 0);
    }
%>
<%
    if (request.getParameter("quantity0")!=null){
        quantity0= Integer.parseInt(request.getParameter("quantity0"));
        application.setAttribute("quantity0", (int)application.getAttribute("quantity0")+quantity0);
    }
    if (request.getParameter("quantity1")!=null){
        quantity1= Integer.parseInt(request.getParameter("quantity1"));
        application.setAttribute("quantity1", (int)application.getAttribute("quantity1")+quantity1);
    }
    if (request.getParameter("quantity2")!=null){
        quantity2= Integer.parseInt(request.getParameter("quantity2"));
        application.setAttribute("quantity2", (int)application.getAttribute("quantity2")+quantity2);
    }
    if (request.getParameter("quantity3")!=null){
        quantity3= Integer.parseInt(request.getParameter("quantity3"));
        application.setAttribute("quantity3", (int)application.getAttribute("quantity3")+quantity3);
    }
    GoodsBean goodsBean=new GoodsBean();
    ArrayList<Map<String,Object>> lst=goodsBean.getLst();
%>
<body>
<h1>Mike!Welcome to Online Shopping</h1>
<p style="font-size: large">访问量：<%=countApp%></p>
<hr width="600px" align="left">
<table>
    <tr class="txt">
        <td>ITEM NO</td>
        <td>SHIRT TYPE</td>
        <td>PRICE</td>
        <td>QUANTITY</td>
        <td>BUY</td>
    </tr>
    <%
        for (int i=0;i<lst.size();i++){
            Map<String,Object> item=lst.get(i);
            no= (int) item.get("no");
            name= (String) item.get("name");
            price= (double) item.get("price");
    %>
    <tr>
        <td><%=no%></td>
        <td><%=name%></td>
        <td><%=price%></td>
        <form action="shoppingcar.jsp" method="post">
        <td>
            <input type="text" name="quantity<%=i%>" placeholder="1">
        </td>
        <td>
            <input type="submit" class="btn" name="sub" value="加入购物车">
        </td>
        </form>
    </tr>
    <%
        }
    %>
</table>
<br>
<a href="cart.jsp">去结算</a>
</body>
</html>
