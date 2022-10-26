<%@ page import="com.study.container.Student" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/25
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br>---------------c:set 将变量存放到指定域中--------------------<br>
<c:set var="name" value="张三" scope="session"/>
name=${sessionScope.name}<br>

<br>---------------c:set 为Bean的属性赋值---------------------<br>
<%
    Student student=new Student();
    pageContext.setAttribute("student", student);
%>
<c:set value="张三" property="name" target="${pageScope.student}"></c:set>
<c:set value="20" property="age" target="${pageScope.student}"></c:set>
student=${student}<br>

<br>---------------c:set 为Map赋值---------------------<br>
<%
    Map<String,Object> map=new HashMap<>();
    pageContext.setAttribute("map", map);
%>
<c:set value="游泳" property="爱好" target="${pageScope.map}"></c:set>
map=${map.get("爱好")}
</body>
</html>
