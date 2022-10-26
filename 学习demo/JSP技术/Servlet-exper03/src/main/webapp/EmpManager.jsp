<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息管理系统</title>
</head>

<%
    String username= (String) session.getAttribute("username");
    Integer countApp = (Integer)application.getAttribute("Count");
    if(countApp==null){
        countApp = 1;
    }else{
        countApp++;
    }
    application.setAttribute("Count", countApp);
%>

<body>

<h1 align="center">员工信息管理系统</h1>
<span style="float: right">欢迎<%=username%>,您是第<%=countApp%>位访客 | <a href="Login.jsp">退出</a></span>
<hr width="auto">

<form action="search" method="post">
    <input type="text" name="empId" placeholder="请输入要查询的员工编号">
    <input type="submit" value="查询">
</form>

<%
    if (request.getAttribute("flag")==null){
%>
<%@include file="ListAll.jsp"%>
<a href="Add.jsp" style="font-size: large">新增员工</a>

<%
    }else{
        if ((boolean)request.getAttribute("flag")){
            EmployPojo emp= (EmployPojo) request.getAttribute("Emp");
%>
<table border="1" width="100%">
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
        }else{
%>
<h2>未查询到该员工编号的员工！</h2>
<%
        }
        request.removeAttribute("flag");
%>
<a href="EmpManager.jsp">返回</a>
<%
    }
%>

</body>
</html>
