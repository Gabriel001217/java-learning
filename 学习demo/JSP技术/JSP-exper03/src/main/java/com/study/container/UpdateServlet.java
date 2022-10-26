package com.study.container;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext = req.getServletContext();
        EmployDAO employDAO= (EmployDAO) servletContext.getAttribute("EmployDAO");
        int empNo= Integer.parseInt(req.getParameter("empID"));
        int choice= Integer.parseInt(req.getParameter("choice"));
        String attribute=null;
        switch (choice){
            case 1:
                attribute="ename";
                break;
            case 2:
                attribute="job";
                break;
            case 3:
                attribute="mgr";
                break;
            case 4:
                attribute="hiredate";
                break;
            case 5:
                attribute="sal";
                break;
            case 6:
                attribute="deptno";
                break;
        }
        String info=req.getParameter("info");
        boolean flag=employDAO.Update(empNo,choice ,attribute, info);
        EmployPojo emp=employDAO.FindByID(empNo);
        req.setAttribute("isSuccess", flag);
        req.setAttribute("Emp", emp);
        req.getRequestDispatcher("UpdateInfo.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
