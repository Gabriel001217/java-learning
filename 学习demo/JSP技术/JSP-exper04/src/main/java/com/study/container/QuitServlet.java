package com.study.container;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

public class QuitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String username = (String) session.getAttribute("username");
        ServletContext servletContext = req.getServletContext();
        Map<String,HttpSession> map= (Map<String, HttpSession>) servletContext.getAttribute("user");
        map.remove(username);
        servletContext.setAttribute("user", map);
        session.setAttribute("flag", false);
        resp.sendRedirect(req.getContextPath()+"/jsp/welcome.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
