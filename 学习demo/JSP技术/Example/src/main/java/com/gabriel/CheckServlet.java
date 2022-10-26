package com.gabriel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class CheckServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        int num1= (int) session.getAttribute("num1");
        int num2= (int) session.getAttribute("num2");

        int ans= Integer.parseInt(req.getParameter("answer"));
        if (ans==num1+num2){
            req.getRequestDispatcher("Success.jsp").forward(req, resp);
        }else {
            req.getRequestDispatcher("Failed.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
