package com.study.container;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        username=new String(username.getBytes("ISO8859-1"),"UTF-8");

        String age=req.getParameter("age");

        System.out.println("name = "+username);
        System.out.println("age = "+age);

        //向request域中放入属性
        req.setAttribute("attrName",username);
        req.setAttribute("attrAge",age);

        //请求转发
        req.getRequestDispatcher("other").forward(req, resp);
    }
}
