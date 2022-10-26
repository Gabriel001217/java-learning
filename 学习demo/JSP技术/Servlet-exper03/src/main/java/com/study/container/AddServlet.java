package com.study.container;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext = req.getServletContext();
        EmployDAO employDAO= (EmployDAO) servletContext.getAttribute("EmployDAO");
        EmployPojo emp=null;

        int empno= Integer.parseInt(req.getParameter("Empno"));
        String ename=req.getParameter("Ename");
        String job=req.getParameter("Job");
        int mgr= Integer.parseInt(req.getParameter("Mgr"));
        Date hireDate=null;
        try {
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
            hireDate=new Date(dateFormat.parse(req.getParameter("HireDate")).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        double sal= Double.parseDouble(req.getParameter("Sal"));
        int deptno= Integer.parseInt(req.getParameter("Deptno"));

        emp=new EmployPojo(empno,ename,job,mgr,hireDate,sal,deptno);
        boolean flag=employDAO.Insert(emp);
        req.setAttribute("add", flag);
        req.getRequestDispatcher("Add.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("LoginError.jsp");
    }
}
