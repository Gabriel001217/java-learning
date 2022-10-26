<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/24
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    Integer count = (Integer)session.getAttribute("Count");
    Integer countRequest = (Integer)request.getAttribute("Count");
    Integer countApp = (Integer)application.getAttribute("Count");
    if(countApp==null){
        countApp = 1;
    }else{
        countApp++;
    }
    if(countRequest == null){
        countRequest = 1;
    }else{
        countRequest++;
    }
    if(count==null){
        count = 1;
    }else{
        count++;
    }
    session.setAttribute("Count", count);
    request.setAttribute("Count", countRequest);
    application.setAttribute("Count", countApp);
    pageContext.setAttribute("Count", 1);

%>
<h1>CountInSession:<%=count%></h1>
<h1>CountInRequest:<%=countRequest%></h1>
<h1>CountInApplication:<%=countApp%></h1>
</body>
</html>
