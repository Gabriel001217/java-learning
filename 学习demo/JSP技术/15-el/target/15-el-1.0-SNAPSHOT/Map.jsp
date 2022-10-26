<%@ page import="java.util.Map" %>
<%@ page isELIgnored="false" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.study.container.School" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/16
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--EL可以通过索引访问LIST，但无法访问Set，因为Set中没有索引的概念--%>
<%
    Map<String,Object> map=new HashMap<>();
    map.put("mobile", "1234567");
    map.put("school", new School("清华大学", "北京海淀"));
    map.put("age", 21);
    pageContext.setAttribute("map", map);
%>
school=${map.school}<br>
school.name=${map.school.sname}<br>
mobile=${map.mobile}<br>
age=${map.age}<br>

<%
    String username=null;
    String password="";

    List<School> schools=new ArrayList<>();
    pageContext.setAttribute("username", username);
    pageContext.setAttribute("password", password);
%>
<%--empty对于没有定义的变量的运算结果为：true--%>
empty name=${empty name}<br>
<%--empty对于为null的引用的运算结果为：true--%>
empty username=${empty username}<br>
<%--empty对于空串的String引用的运算结果为：true--%>
empty password=${empty password}<br>
<%--empty对于没有元素的数组或集合的运算的结果为：true--%>
empty schools=${empty schools}<br>
</body>
</html>
