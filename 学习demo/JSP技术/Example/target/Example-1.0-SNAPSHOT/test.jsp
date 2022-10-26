<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/12/14
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<p>${paramValues.name[1]}</p>--%>

<%
    List<String> names = new ArrayList<>();
    names.add("xxx");
    names.add("yyy");
    pageContext.setAttribute("names", names);
%>
name=${pageScope.names[1]}
<br>
<%
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("age", 20);
    map.put("name", "xlj");
    pageContext.setAttribute("map", map);
%>
Name=${pageScope.map.name}
<br>
Name=${initParam.name}
<br>
<c:set var="student" value="Mike" scope="page"></c:set>
<c:out value="${student}"></c:out><br>
<br>
<c:url value="/Success.jsp" context="/Test" var="abc">
    <c:param name="type" value="20"/>
    <c:param name="name" value="zhangsan"/>
</c:url>
<c:out value="${abc}"/>
<br>
<%
    Map student = new LinkedHashMap<String, Object>();
    student.put("no", 1001);
    student.put("name", "Mike");
    student.put("age", 18);
    student.put("salary", 8200);
    request.setAttribute("s", student);
%>
<c:forEach items="${s}" var="i" step="2">
    ${i.value}
</c:forEach>
<br>
<% List<String> list = new ArrayList<String>();
    list.add(0, "香蕉");
    list.add(1, "橘子");
    list.add(2, "苹果");
    list.add(3, "西瓜");
    list.add(4, "李子");
    request.setAttribute("list", list); %>
<c:forEach var="shuiguo" items="${list}" begin="1" end="3" step="2">
    &nbsp;<c:out value="${ shuiguo }"/><br/>
</c:forEach>
<br>
<c:forTokens items="google,runoob,taobao" delims="," var="name">
<c:out value="${name}"/><p>
    </c:forTokens>
</body>
<br>
<%
    pageContext.setAttribute("name", "linjie");
    request.setAttribute("name", "lucy");
    session.setAttribute("name", "king");
    application.setAttribute("name", "bilibili");
%>
name=${name}
</html>
