<%@ page import="com.study.container.EmployDAO" %>
<%@ page import="com.study.container.EmployPojo" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/5
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>查找员工信息</h1>
<hr width="auto">
<form action="search" method="post">
    <input type="text" name="empID" placeholder="请输入要查找的员工编号：">
    <input type="submit" value="查找">
</form>
<%
    if (request.getAttribute("Emp")!=null){
        EmployPojo emp= (EmployPojo) request.getAttribute("Emp");
%>
<table border="1">
    <tr>
        <td>员工编号</td>
        <td>员工姓名</td>
        <td>员工职务</td>
        <td>上司编号</td>
        <td>入职日期</td>
        <td>员工工资</td>
        <td>部门编号</td>
    </tr>
    <tr>
        <td><%=emp.getEmpno()%></td>
        <td><%=emp.getEname()%></td>
        <td><%=emp.getJob()%></td>
        <td><%=emp.getMgr()%></td>
        <td><%=emp.getHireDate()%></td>
        <td><%=emp.getSal()%></td>
        <td><%=emp.getDeptno()%></td>
    </tr>
</table>
<%
    }
%>
</body>
</html>
