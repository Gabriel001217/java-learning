<%@ page import="com.study.coontainer.DataBean" %>
<%@ page import="java.util.List" %>
<%@ page import="com.study.coontainer.Data" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/8
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    double mag;
    String place;
    long time;
    String url;
    Data data;
%>
<table border="1">
    <tr>
        <td>震级</td>
        <td>地址</td>
        <td>时间</td>
        <td>URL</td>
    </tr>
    <%
        DataBean dataBean=new DataBean();
        List<Data> list=dataBean.GetData();
        for (int i=0;i<list.size();i++){
            data= list.get(i);
            mag=data.getMag();
            place=data.getPlace();
            time=data.getTime();
            url=data.getUrl();
            Date date=new Date(time);
            DateFormat dateFormat=DateFormat.getDateTimeInstance();
    %>
    <tr>
        <td><%=mag%></td>
        <td><%=place%></td>
        <td><%=dateFormat.format(date)%></td>
        <td><a href="<%=url%>"> <%=url%></a></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
