<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/6
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>欢迎访问</title>
    <link rel="stylesheet" href="css/login.css">
    <link rel="stylesheet" href="css/font-awesome.css">

    <style>
        input::-webkit-input-placeholder {
            color:white;
        }
        input::-moz-placeholder {
            /* Mozilla Firefox 19+ */
            color: white;
        }
        input:-moz-placeholder {
            /* Mozilla Firefox 4 to 18 */
            color: white;
        }
        input:-ms-input-placeholder {
            /* Internet Explorer 10-11 */
            color: white;
        }
    </style>
</head>

<body>
<form action="login" method="POST">
    <div id="login-box">
        <h1>Login</h1>
        <div class="form">
            <div class="item">
                <i class="fa fa-user-circle" aria-hidden="true"></i>
                <input type="text" placeholder="username" name="username">
            </div>

            <div class="item">
                <i class="fa fa-key" aria-hidden="true"></i>
                <input type="password" placeholder="password" name="password">
            </div>
        </div>
        <button type="submit">Login</button>
    </div>
</form>
</body>

<footer>
    <div id="message-box">Hello, I'm Gabriel!</div>
</footer>

</html>

