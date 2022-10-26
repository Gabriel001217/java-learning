<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/12/14
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="CarShow.jsp">
    <label>品牌：<input type="text" name="brand" />  </label>
    <p> <label>型号：<input type="text" name="id" />    </label>  </p>
    <p> <label>价钱：<input type="text" name="price" />    </label>  </p>
    <p> <label>座位数：<input type="text" name="seats" /> </label>  </p>
    <p>
        <label>
            <input type="submit" name="Submit" value="提交" />
        </label>
        <label>
            <input type="reset" name="reset" value="重置" />
        </label>
    </p>
</form>
</body>
</html>
