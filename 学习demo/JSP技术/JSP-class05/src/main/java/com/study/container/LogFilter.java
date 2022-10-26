package com.study.container;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//过滤器
public class LogFilter implements Filter {

    private FilterConfig filterConfig=null;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("before server**********");
        HttpServletRequest req= (HttpServletRequest) servletRequest;
        HttpSession session = req.getSession();
        session.setAttribute("key","abc");
        session.removeAttribute("key");
        session.setAttribute("key", "123");
        req.getRemoteAddr();
        String name = (String) session.getAttribute("username");
        if (name==null||"".equals(name)){
            //跳转到登陆页面
        }

        //必须要写，否则请求无法到达服务器
        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("after server**********");
    }

    @Override
    public void destroy() {

    }
}
