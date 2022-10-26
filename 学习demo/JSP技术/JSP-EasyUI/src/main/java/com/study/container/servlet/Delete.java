package com.study.container.servlet;

import com.study.container.dao.StudentDao;
import com.study.container.daoimpl.DaoFactory;
import com.study.container.util.DatabaseConnectionUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class Delete extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("textml;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        try {
            DatabaseConnectionUtil dbc = new DatabaseConnectionUtil();
            StudentDao dao = DaoFactory.getStudentDaoInstance();
            String id = req.getParameter("id");
            dao.doDelete(Integer.parseInt(id));
            out.println("{\"success\":true}");
        } catch (ClassNotFoundException ex) {
            String msg = ex.getMessage();
            out.print("{\"success\":false,\"errorMsg\":'" + msg + "'}");
        } catch (SQLException ex) {
            String msg = ex.getMessage();
            out.print("{\"success\":false,\"errorMsg\":'" + msg + "'}");
        } catch (Exception ex) {
            String msg = ex.getMessage();
            out.print("{\"success\":false,\"errorMsg\":'" + msg + "'}");
        } finally {
            out.close();
        }
    }
}
