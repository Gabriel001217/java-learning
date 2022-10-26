package com.study.container;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收指定名称的请求参数
        String username=req.getParameter("username");

        //对于请求中的中文乱码的万能解决方案

        //打散：将name字符串按照原来的编码进行打散
        byte[] bytes=username.getBytes("ISO8859-1");
        //组装：将bytes字节数组按照指定字符编码进行组装，组装为String
        username=new String(bytes,"UTF-8");

        String age=req.getParameter("age");

        System.out.println("name = "+username);
        System.out.println("age = "+age);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
