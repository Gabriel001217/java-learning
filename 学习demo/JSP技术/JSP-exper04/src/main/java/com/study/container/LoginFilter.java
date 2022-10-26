package com.study.container;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req= (HttpServletRequest) servletRequest;
        HttpServletResponse resp= (HttpServletResponse) servletResponse;
        HttpSession session = req.getSession();
        if (session.getAttribute("flag")!=null){
            if ((boolean) session.getAttribute("flag")){
                filterChain.doFilter(servletRequest, servletResponse);
            }else {
                session.invalidate();
                resp.sendRedirect(req.getContextPath()+"/index.jsp");
            }
        }else {
            resp.sendRedirect(req.getContextPath()+"/index.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}
