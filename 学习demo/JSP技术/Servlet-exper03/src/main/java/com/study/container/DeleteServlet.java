package com.study.container;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext = req.getServletContext();
        EmployDAO employDAO= (EmployDAO) servletContext.getAttribute("EmployDAO");

        int empno= Integer.parseInt(req.getParameter("Empno"));
        boolean flag=employDAO.Del(empno);
        resp.sendRedirect("EmpManager.jsp");
    }
}
