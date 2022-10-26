package com.study.container;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

/*
解决POST提交时中文乱码问题
* */
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置了请求正文中的字符编码,其无法解决GET提交时的中文乱码
        req.setCharacterEncoding("UTF-8");

        //接收指定名称的请求参数
        String username=req.getParameter("username");
        String age=req.getParameter("age");

        System.out.println("name = "+username);
        System.out.println("age = "+age);

    }
}
