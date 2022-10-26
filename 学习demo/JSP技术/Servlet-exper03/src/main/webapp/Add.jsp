<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/6
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增员工</title>
</head>
<body>
<h1>新增员工</h1>
<hr width="auto">
<form action="add" method="post">
    员工编号：<input type="text" name="Empno"><br>
    员工姓名：<input type="text" name="Ename"><br>
    员工职务：<input type="text" name="Job"><br>
    上司编号：<input type="text" name="Mgr"><br>
    入职日期：<input type="text" name="HireDate"><br>
    员工工资：<input type="text" name="Sal"><br>
    部门编号：<input type="text" name="Deptno"><br>
    <input type="reset" value="重置">
    <input type="submit" value="添加">
</form>

<%
    if (request.getAttribute("add")!=null){
        if ((boolean)request.getAttribute("add")){
%>
<hr width="auto">
<h2>添加成功！</h2>
<%
    request.removeAttribute("add");
    response.setHeader("refresh", "2;URL=EmpManager.jsp");
}else{
    request.removeAttribute("add");
%>
<hr width="auto">
<h2>添加失败！</h2>
<%
        }
    }
%>
</body>
</html>
