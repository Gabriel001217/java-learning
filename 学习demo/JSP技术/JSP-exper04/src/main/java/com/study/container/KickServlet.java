package com.study.container;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

public class KickServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username= req.getParameter("username");
        ServletContext servletContext = req.getServletContext();
        Map<String, HttpSession> map= (Map<String, HttpSession>) servletContext.getAttribute("user");
        HttpSession session = map.get(username);
        session.setAttribute("flag", false);
        map.remove(username);
        servletContext.setAttribute("user", map);
        resp.sendRedirect(req.getContextPath()+"/jsp/ListAll.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
