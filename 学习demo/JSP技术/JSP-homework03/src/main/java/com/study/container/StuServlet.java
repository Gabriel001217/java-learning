package com.study.container;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StuServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter=resp.getWriter();
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

        printWriter.println("<table border=\"1\" style=\"font-weight: bold\">");
        printWriter.println("<tr>");
        printWriter.println("<td><b>学号</b></td>");
        printWriter.println("<td><b>姓名</b></td>");
        printWriter.println("<td><b>平时成绩</b></td>");
        printWriter.println("<td><b>实验成绩</b></td>");
        printWriter.println("<td><b>期末成绩</b></td>");
        printWriter.println("<td><b>总评</b></td>");
        printWriter.println("</tr>");

        for (int i=0;i<lst.size();i++){
            student=lst.get(i);
            int num=(int)student.get("学号");
            String name= (String) student.get("姓名");
            int usualPoint=(int)student.get("平时成绩");
            int experPoint=(int)student.get("实验成绩");
            int finalPoint=(int)student.get("期末成绩");
            printWriter.println("<tr>");
            printWriter.println("<td>"+num+"</td>");
            printWriter.println("<td>"+name+"</td>");
            printWriter.println("<td>"+usualPoint+"</td>");
            printWriter.println("<td>"+experPoint+"</td>");
            printWriter.println("<td>"+finalPoint+"</td>");
            if ((int)student.get("期末成绩")>=50){
                int point=(int) (usualPoint*0.1+experPoint*0.2+finalPoint*0.7);
                if (point<60){
                    printWriter.println("<td style=\"color:red\">"+point+"</td>");
                }else {
                    printWriter.println("<td>"+point+"</td>");
                }
            }else {
                int point=finalPoint;
                printWriter.println("<td style=\"color:red\">"+point+"</td>");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
