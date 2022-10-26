<%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/10/12
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../js/themes/default/easyui.css" type="text/css" />
    <link rel="stylesheet" href="../js/themes/icon.css" type="text/css" />
    <link rel="stylesheet" href="../js/themes/color.css" type="text/css" />
    <link rel="stylesheet" href="../css/demo.css" type="text/css" />
    <script type="text/javascript" src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../js/locale/easyui-lang-zh_CN.js"></script>
    <script>
        function newStudent() {
            $('#dlg').dialog('open').dialog('setTitle', '创建新学生');
            $('#fm').form('clear');
            $('#id').textbox({'readonly':false});
            url = '/JSP_EasyUI/create';
        }

        function saveStudent() {
            $('#fm').form('submit', {
                url: url,
                onSubmit: function() {
                    return $(this).form('validate');
                },
                success: function(result) {
                    var result = eval('(' + result + ')');
                    if (result.errorMsg) {
                        $.messager.show({
                            title: 'Error',
                            msg: result.errorMsg
                        });
                    } else {
                        $('#dlg').dialog('close');        // close the dialog
                        $('#dgstudent').datagrid('reload');    // reload the user data
                    }
                }
            });
        }

        function editStudent() {
            var row = $('#dgstudent').datagrid('getSelected');
            if (row) {
                $('#dlg').dialog('open').dialog('setTitle', '编辑');
                $('#fm').form('load', row);
                $('#id').textbox({'readonly':true});
                url = '/JSP_EasyUI/update';
            }else{
                $.messager.show({
                    title: '系统提示',
                    msg: '请选择一行数据后再操作'
                });
            }
        }

        function destroyStudent() {
            var row = $('#dgstudent').datagrid('getSelected');
            if (row) {
                $.messager.confirm('提示',
                    '<font color=\'red\'>删除后将无法恢复，请谨慎操作！！！</font><br/>您确定要删除<'+row.name+'>信息吗?', function(r) {
                        if (r) {
                            $.post('/JSP_EasyUI/delete',
                                {id: row.id}, function(result) {
                                    if (result.success) {
                                        $('#dgstudent').datagrid('reload');    // reload the user data
                                    } else {
                                        $.messager.show({// show error message
                                            title: 'Error',
                                            msg: result.errorMsg
                                        });
                                    }
                                }, 'json');
                        }
                    });
            }
        }

        function doSearch() {
            $('#dgstudent').datagrid('load', {
                searchKey: $('#fuzzyWord').textbox('getValue')
            });
        }

    </script>
</head>
<body class="easyui-layout">
    <table id="dgstudent" title="学生信息管理" class="easyui-datagrid"
           url="/JSP_EasyUI/load"
           toolbar="#toolbar"
           rownumbers="true" fitColumns="true" singleSelect="true"
           data-options="pagination:true,fitColums:true">
        <thead>
        <tr>
            <th field="id" >ID</th>
            <th field="name" width="100">姓名</th>
            <th field="birthday" width="200">生日</th>
            <th field="score"  width="60" align="right">分数</th>
            <th field="major"  width="160">主修</th>
            <th field="telphone"  width="60">电话号码</th>
        </tr>
        </thead>
    </table>

    <div id="toolbar">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newStudent()">增加</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editStudent()">修改</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyStudent()">删除</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick="refreshStudent()">刷新</a>
        <input id="fuzzyWord" class="easyui-textbox" style="margin-left:20px;line-height:26px;border:1px solid #ccc" data-options="prompt:'输入查询关键字'">
        <a href="#" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="doSearch()">查询</a>
    </div>

    <div id="dlg" class="easyui-dialog" style="width:420px;height:400px;padding:5px" closed="true" buttons="#dlg-buttons">
        <div class="ftitle">学生信息</div>
        <form id="fm" method="post">
            <div class="fitem"  >
                <label>ID:</label>
                <input id="id"  name="id" class="easyui-textbox" name="ID"  required="true">
            </div>

            <div class="fitem">
                <label>姓名:</label>
                <input id="name" name="name" class="easyui-textbox"   required="true">
            </div>
            <div class="fitem">
                <label>生日:</label>
                <input id="adress" name="birthday" class="easyui-datebox" data-options="prompt:'请输入正确的日期',required:true" >
            </div>
            <div class="fitem">
                <label>主修:</label>
                <input name="major" class="easyui-textbox">
            </div>
            <div class="fitem">
                <label>分数:</label>
                <input id="adress" name="score" class="easyui-numberbox" >
            </div>
            <div class="fitem">
                <label>电话号码:</label>
                <input id="adress" name="telphone" class="easyui-textbox" data-options="prompt:'请输入正确的电话号码'" >
            </div>
        </form>
    </div>

    <div id="dlg-buttons">
        <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveStudent()">保存</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">取消</a>
    </div>

</body>
</html>
