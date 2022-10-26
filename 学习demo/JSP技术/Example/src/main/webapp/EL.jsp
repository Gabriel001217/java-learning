<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<html>
<body>
<%--EL只能从四大域中获取数据。--%>
<%--其查找数据的顺序是，依次按照由小到大的范围从四大域中查找指定名称的属性值--%>
<%
    String username="Gabriel";
    application.setAttribute("username",username);
%>
username=${username}<br>
<%--从指定的域中获取属性值--%>
username=${applicationScope.username}<br>
<%
    pageContext.setAttribute("address", "中国");
    request.setAttribute("address", "江苏");
    session.setAttribute("address", "镇江市");
    application.setAttribute("address", "江苏科技大学");
%>
address=${address}<br>
<%--若访问为null的对象的属性，EL是不会抛出空指针异常的，其仅仅是不显示而已--%>
address=${sessionScope.address}
</body>
</html>
