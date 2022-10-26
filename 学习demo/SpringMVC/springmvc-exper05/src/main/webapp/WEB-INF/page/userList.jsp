<%@ page import="com.gabriel.pojo.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/11/27
  Time: 23:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<User> userList= (List<User>) request.getAttribute("userList");
    if (userList!=null){
        application.setAttribute("itemList", userList);
    }else {
        userList= (List<User>) application.getAttribute("itemList");
    }
%>
<h2 align="center">用户信息</h2>
<table border="1px" align="center" width="80%">
    <tr>
        <td>序号</td>
        <td>用户名</td>
        <td>真实姓名</td>
        <td>密码</td>
        <td>手机号</td>
        <td colspan="2" align="center">操作</td>
    </tr>
    <%
        int i=0;
        for (User user : userList) {
            i++;
    %>
    <tr>
        <td><%=i%></td>
        <td><%=user.getUsername()%></td>
        <td><%=user.getRealname()%></td>
        <td><%=user.getPassword()%></td>
        <td><%=user.getPhone()%></td>
        <td><a href="${pageContext.request.contextPath}/userUpdate.action?username=<%=user.getUsername()%>&realname=<%=user.getRealname()%>&password=<%=user.getPassword()%>&phone=<%=user.getPhone()%>">修改</a></td>
        <td><a href="${pageContext.request.contextPath}/delUser.action?username=<%=user.getUsername()%>" id="del">删除</a></td>
    </tr>
    <%
        }
    %>
</table>
<p align="center"><a href="${pageContext.request.contextPath}/manager.action">返回上一级</a></p>
</body>
</html>
