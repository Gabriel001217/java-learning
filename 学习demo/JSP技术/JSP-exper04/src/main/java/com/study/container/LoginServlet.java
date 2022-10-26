package com.study.container;

import com.mysql.cj.Session;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        ServletContext servletContext = req.getServletContext();
        List<String> list=new ArrayList<>();

        String username=req.getParameter("username");
        String password=req.getParameter("password");
        if (username!=null&&"123".equals(password)){
            session.setAttribute("username", username);
            session.setAttribute("date", new Date());
            System.out.println("username0="+username);
            session.setAttribute("flag",true);
            list.add(username);
            servletContext.setAttribute("username", list);
            resp.sendRedirect("jsp/welcome.jsp");
        }else{
            session.setAttribute("flag",false);
            resp.sendRedirect("ErrorPage.jsp");
        }

    }
}
