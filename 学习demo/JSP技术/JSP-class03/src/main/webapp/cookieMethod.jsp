<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.net.URLEncoder" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/24
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String encodeName = URLEncoder.encode("张三","UTF-8");  //中文需要编码解码

    request.setCharacterEncoding("utf-8");

    Cookie nameCookie = new Cookie("name",encodeName);
    Cookie passCookie = new Cookie("pass","123");


    passCookie.setMaxAge(10); //存活10秒

    //passCookie.setDomain("localhost");//可以访问到
    //passCookie.setDomain("b.test.com");//访问当前页面无法看到该cookie
    response.addCookie(nameCookie);
    response.addCookie(passCookie);

    Cookie[] cookies = request.getCookies();
    if(cookies==null){    //避免下面for循环抛出空指针异常
        cookies = new Cookie[0];
    }

%>
<h1>Hello World!</h1>
<table>
    <tr><td>Name</td><td>Value</td><td>age</td><td>domain</td><td>path</td><td>version</td><td>secure</td></tr>
    <% for(Cookie c:cookies){
        String value = URLDecoder.decode(c.getValue(),"utf-8");
    %>
    <tr><td><%=c.getName()%></td>
        <td><%=value%></td>
        <td><%=c.getMaxAge()%></td>
        <td><%=c.getDomain()%></td>
        <td><%=c.getPath()%></td>
        <td><%=c.getVersion()%></td>
        <td><%=c.getSecure()%></td>
    </tr>
    <%}%>
</table>
</body>
</html>
