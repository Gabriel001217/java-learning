package com.study.container;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

//重定向时的数据传输
public class SomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        username=new String(username.getBytes("ISO8859-1"),"UTF-8");

        String age=req.getParameter("age");

        System.out.println("name = "+username);
        System.out.println("age = "+age);

        //编码：打散
        username= URLEncoder.encode(username, "UTF-8");

        //重定向
        resp.sendRedirect("other?pname="+username+"&page"+age);
    }
}
