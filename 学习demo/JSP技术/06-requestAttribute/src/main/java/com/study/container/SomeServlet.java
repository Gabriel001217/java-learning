package com.study.container;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//实现了跨servlet的数据传输
public class SomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //向请求中放入属性
        req.setAttribute("name", "zheng");
        req.setAttribute("age", 20);

        //将请求转发给OtherServlet
        RequestDispatcher rd=req.getRequestDispatcher("/other");
        rd.forward(req, resp);
    }
}
