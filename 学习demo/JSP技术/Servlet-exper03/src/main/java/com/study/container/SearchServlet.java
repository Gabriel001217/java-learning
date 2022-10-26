package com.study.container;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SearchServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext = req.getServletContext();
        EmployDAO employDAO= (EmployDAO) servletContext.getAttribute("EmployDAO");
        int empId= Integer.parseInt(req.getParameter("empId"));
        EmployPojo emp=employDAO.FindByID(empId);
        if (emp!=null) {
            req.setAttribute("Emp", emp);
            req.setAttribute("flag", true);
        }else{
            req.setAttribute("flag",false);
        }
        req.getRequestDispatcher("EmpManager.jsp").forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("LoginError.jsp");
    }
}
