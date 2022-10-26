<%@ page import="com.study.container.EmployDAO" %>
<%@ page import="com.study.container.EmployPojo" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/6
  Time: 17:06
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
<table border="1" width="100%">
    <tr>
        <td>员工编号</td>
        <td>员工姓名</td>
        <td>员工职务</td>
        <td>上司编号</td>
        <td>入职日期</td>
        <td>员工工资</td>
        <td>部门编号</td>
        <td colspan="2">操作</td>
    </tr>
    <%
        for (EmployPojo emp:list){
            String updateUrl="Update.jsp?Empno="+emp.getEmpno()+"&Ename="+emp.getEname()+"&Job="+emp.getJob()+"&Mgr="
                    +emp.getMgr()+"&HireDate="+emp.getHireDate()+"&Sal="+emp.getSal()+"&Deptno="+emp.getDeptno();
            String delUrl="del?Empno="+emp.getEmpno();
    %>
    <tr>
        <td><%=emp.getEmpno()%></td>
        <td><%=emp.getEname()%></td>
        <td><%=emp.getJob()%></td>
        <td><%=emp.getMgr()%></td>
        <td><%=emp.getHireDate()%></td>
        <td><%=emp.getSal()%></td>
        <td><%=emp.getDeptno()%></td>
        <td><a href=<%=updateUrl%>>修改</a></td>
        <td><a href=<%=delUrl%>>删除</a></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
