package com.study.container;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MulTable extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter=resp.getWriter();
        printWriter.println("<table border=\"1\" style=\"font-weight: bold\">");
        printWriter.println("<tr>");
        printWriter.println("<td>&nbsp;</td>");
        for(int i=1;i<=9;i++){
            printWriter.println("<td>"+i+"</td>");
        }
        printWriter.println("</tr>");
        for (int i=1;i<=9;i++){
            printWriter.println("<tr>");
            printWriter.println("<td>"+i+"&nbsp;&nbsp;</td>");
            for (int j=1;j<=i;j++){
                printWriter.println("<td>"+i+"&nbsp;*&nbsp;"+j+"&nbsp;=&nbsp;"+i*j+"</td>");
            }
            printWriter.println("</tr>");
        }
        printWriter.println("</table>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
