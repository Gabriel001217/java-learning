<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/24
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registForm</title>
</head>
<body>
<h1>注册</h1>
<form name="registerform" method="post" action="display.jsp">
    用户名: <input type="text" name="name"/> <br/>
    密码:  <input type="password" name="pass"/><br/>
    性别: <input type="radio" name="sex" value="male"/>男
    <input type="radio" name="sex" value="female"/>女  <br/>
    学历：<select name="xueli">
    <option name="xiaoxue" value="小学">小学</option>
    <option name="zhongxue" value="中学">中学</option>
    <option name="daxue" value="大学">大学</option>
    </select><br/>
        兴趣：<input type="checkbox" name="interest" value="reading"/>阅读
        <input type="checkbox" name="interest" value="food"/>美食
        <input type="checkbox" name="interest" value="travel"/>旅游
        <input type="checkbox" name="interest" value="swimming"/>游泳<br/>
        <input type="reset" value="取消"/> <input type="submit" value="确定"/>
</form>
</body>
</html>
