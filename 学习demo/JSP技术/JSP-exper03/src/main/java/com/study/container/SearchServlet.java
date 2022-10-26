package com.study.container;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext = req.getServletContext();
        EmployDAO employDAO= (EmployDAO) servletContext.getAttribute("EmployDAO");
        int empNo= Integer.parseInt(req.getParameter("empID"));
        EmployPojo emp=employDAO.FindByID(empNo);
        req.setAttribute("Emp", emp);
        req.getRequestDispatcher("FindByID.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
