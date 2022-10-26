<%@ page import="com.study.container.EmployPojo" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/5
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>请根据提示更新员工信息！</h1>
<hr width="auto">
<form action="update" method="post">
    请输入要更新的员工编号：<input type="text" name="empID"><br>
    请选择要更新的属性：<input type="radio" name="choice" value="1" checked>姓名
    <input type="radio" name="choice" value="2">职务
    <input type="radio" name="choice" value="3">上司编号
    <input type="radio" name="choice" value="4">入职日期
    <input type="radio" name="choice" value="5">工资
    <input type="radio" name="choice" value="6">部门编号<br>
    请输入更新后的内容：<input type="text" name="info"><br>
    <input type="submit" value="确定">
</form>
<%
    if (request.getAttribute("isSuccess")!=null&&(boolean)request.getAttribute("isSuccess")){
        EmployPojo emp= (EmployPojo) request.getAttribute("Emp");
%>
<h3>修改成功！</h3>
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
    }else {
%>
<h3>修改失败！</h3>
<%
    }
%>
</body>
</html>
