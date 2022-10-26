<%@ page import="com.study.container.EmployDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="com.study.container.EmployPojo" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/5
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    EmployDAO employDAO= (EmployDAO) application.getAttribute("EmployDAO");
    List<EmployPojo> list=employDAO.FindAll();
%>
<h1 align="center">所有员工的信息</h1>
<hr width="auto">
<table border="1" align="center">
    <tr>
        <td>员工编号</td>
        <td>员工姓名</td>
        <td>员工职务</td>
        <td>上司编号</td>
        <td>入职日期</td>
        <td>员工工资</td>
        <td>部门编号</td>
    </tr>
    <%
        for (EmployPojo emp:list){
    %>
    <tr>
        <td><%=emp.getEmpno()%></td>
        <td><%=emp.getEname()%></td>
        <td><%=emp.getJob()%></td>
        <td><%=emp.getMgr()%></td>
        <td><%=emp.getHireDate()%></td>
        <td><%=emp.getSal()%></td>
        <td><%=emp.getDeptno()%></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
