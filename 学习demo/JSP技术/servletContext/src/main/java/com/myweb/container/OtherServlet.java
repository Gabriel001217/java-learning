package com.myweb.container;

import javax.servlet.*;
import java.io.IOException;

public class OtherServlet implements Servlet {

    private ServletConfig servletConfig;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig=servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//        获取ServletContext对象
        ServletContext sc= servletConfig.getServletContext();
//        获取域属性
        String email = (String) sc.getAttribute("email");
        System.out.println("email"+"="+email);
//        重置域属性的值
        sc.setAttribute("email", "cba@126.com");
//        删除域属性
        sc.removeAttribute("email");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
