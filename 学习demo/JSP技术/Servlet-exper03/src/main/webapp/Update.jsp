<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/6
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新员工成绩</title>
</head>
<body>

<h1>修改员工信息</h1>
<hr width="auto">

<form action="update" method="post">
    员工编号：<input type="text" name="Empno" value="<%=request.getParameter("Empno")%>" readonly><br>
    员工姓名：<input type="text" name="Ename" value="<%=request.getParameter("Ename")%>"><br>
    员工职务：<input type="text" name="Job" value="<%=request.getParameter("Job")%>"><br>
    上司编号：<input type="text" name="Mgr" value="<%=request.getParameter("Mgr")%>"><br>
    入职日期：<input type="text" name="HireDate" value="<%=request.getParameter("HireDate")%>"><br>
    员工工资：<input type="text" name="Sal" value="<%=request.getParameter("Sal")%>"><br>
    部门编号：<input type="text" name="Deptno" value="<%=request.getParameter("Deptno")%>"><br>
    <input type="reset" value="重置">
    <input type="submit" value="提交">
</form>

<%
    if (request.getAttribute("update")!=null){
        if ((boolean)request.getAttribute("update")){
%>
<hr width="auto">
<h2>修改成功！</h2>
<%
        request.removeAttribute("update");
        response.setHeader("refresh", "2;URL=EmpManager.jsp");
        }else{
            request.removeAttribute("update");
%>
<hr width="auto">
<h2>修改失败！</h2>
<%
        }
    }
%>
</body>
</html>
