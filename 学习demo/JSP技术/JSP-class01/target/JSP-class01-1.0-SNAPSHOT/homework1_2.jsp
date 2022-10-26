<%@ page import="java.util.Map" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 11342
  Date: 2021/9/17
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>homework1_2</title>
    <style>
        .txt{
            color: red;
        }
    </style>
</head>
<body>
<%
    ArrayList<Map<String,Object>> lst=new ArrayList<>();
    Map<String,Object> student=new HashMap<>();
    student.put("学号",1001);
    student.put("姓名","Tom");
    student.put("平时成绩",93);
    student.put("实验成绩",85);
    student.put("期末成绩",88);
    lst.add(student);
    student=new HashMap<>();
    student.put("学号",1002);
    student.put("姓名","Jack");
    student.put("平时成绩",76);
    student.put("实验成绩",72);
    student.put("期末成绩",52);
    lst.add(student);
    student=new HashMap<>();
    student.put("学号",1003);
    student.put("姓名","Mary");
    student.put("平时成绩",67);
    student.put("实验成绩",65);
    student.put("期末成绩",48);
    lst.add(student);
    student=new HashMap<>();
    student.put("学号",1004);
    student.put("姓名","Rose");
    student.put("平时成绩",93);
    student.put("实验成绩",90);
    student.put("期末成绩",85);
    lst.add(student);
    student=new HashMap<>();
    student.put("学号",1005);
    student.put("姓名","Peter");
    student.put("平时成绩",64);
    student.put("实验成绩",86);
    student.put("期末成绩",59);
    lst.add(student);
    student=new HashMap<>();
    student.put("学号",1006);
    student.put("姓名","Mike");
    student.put("平时成绩",80);
    student.put("实验成绩",88);
    student.put("期末成绩",79);
    lst.add(student);
%>
<table border="1">
    <tr>
        <td><b>学号</b></td>
        <td><b>姓名</b></td>
        <td><b>平时成绩</b></td>
        <td><b>实验成绩</b></td>
        <td><b>期末成绩</b></td>
        <td><b>总评</b></td>
    </tr>
    <%
        for (int i=0;i<lst.size();i++){
            student=lst.get(i);
            num=(int)student.get("学号");
            name= (String) student.get("姓名");
            usualPoint=(int)student.get("平时成绩");
            experPoint=(int)student.get("实验成绩");
            finalPoint=(int)student.get("期末成绩");
    %>
    <tr>
        <%!
            int point;
            int num;
            String name;
            int usualPoint;
            int experPoint;
            int finalPoint;
        %>
        <td><%=num%></td>
        <td><%=name%></td>
        <td><%=usualPoint%></td>
        <td><%=experPoint%></td>
        <td><%=finalPoint%></td>
        <%
            if ((int)student.get("期末成绩")>=50){
                point= (int) (usualPoint*0.1+experPoint*0.2+finalPoint*0.7);
                if (point<60){
        %><td class="txt"><%=point%></td>
        <%
            }else{
        %>
        <td><%=point%></td>
        <%
            }}else{
                point=finalPoint;
        %>
        <td class="txt"><%=point%></td>
        <%
                } }
        %>
    </tr>
</table>
</body>
</html>
