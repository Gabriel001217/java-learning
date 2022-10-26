package com.study.container;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username=req.getParameter("username");
        String password=req.getParameter("password");
        HttpSession session = req.getSession();
        session.setAttribute("username", username);
        if ("Gabriel".equals(username)&&"123456".equals(password)){
            //获取application域
            ServletContext servletContext = req.getServletContext();
            //连接数据库
            DatabaseConnectionUtil dbc=new DatabaseConnectionUtil();
            EmployDAO employDAO=new EmployDAO(dbc);
            //将EmployDAO对象存入application域中
            servletContext.setAttribute("EmployDAO", employDAO);
//            req.getRequestDispatcher("EmpManager.jsp").forward(req, resp);
            resp.sendRedirect("EmpManager.jsp");
        }else {
            doGet(req, resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("LoginError.jsp");
    }
}
