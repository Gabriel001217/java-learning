<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/15
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="js/themes/default/easyui.css" type="text/css" />
    <link rel="stylesheet" href="js/themes/icon.css" type="text/css" />
    <link rel="stylesheet" href="js/themes/color.css" type="text/css" />
    <link rel="stylesheet" href="css/demo.css" type="text/css" />
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="js/locale/easyui-lang-zh_CN.js"></script>
</head>
<body class="easyui-layout">
    <div class="easyui-layout" style="width:700px;height:350px;" fit="true">
        <div data-options="region:'north'" style="height:50px">
            <div style="float:left"><p style="font:normal 30px 宋体;margin:20px 10px 0px 60px">江苏科技大学学生信息管理系统</p></div>
            <div style="float:right;font:normal 16px tahoma, arial, sans-serif, 宋体;margin:30px 30px 0 10px;z-index:1000">
                <img src="../img/icon/user.png" width="16" height="16" />&nbsp;<span>${username}&nbsp;${name}</span>&nbsp;|&nbsp;
                <img src="../img/icon/sign_out.png" width="16" height="16" /><a href="../home/logout.jsp" style="color:blue"> 注销</a>
            </div>
        </div>

        <div data-options="region:'south',split:true" style="height:50px;">
            <div data-options="region:'south'" style="height:5%;">版权所有</div>
        </div>

        <%--<div data-options="region:'east',split:true" title="East" style="width:100px;"></div>--%>

        <div data-options="region:'west',split:true" title="菜单栏" style="width:100px;">
            <a class="easyui-linkbutton" href="jsp/Student.jsp" target='contentFrame' style="width:170px;text-align: left" plain="true" iconCls="icon-edit">学生管理</a>
            <a class="easyui-linkbutton" href="jsp/Class.jsp" target='contentFrame' style="width:170px;text-align: left" plain="true" iconCls="icon-edit">班级管理</a>
            <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">实验管理</a>
            <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">Remove</a>
        </div>

        <div data-options="region:'center',title:'Main Title',iconCls:'icon-ok'">
            <iframe id="contentFrame" name="contentFrame" scrolling="auto" frameborder="0" src="jsp/Student.jsp" style="width:100%;height:100%;"></iframe>
        </div>
    </div>
</body>
</html>
