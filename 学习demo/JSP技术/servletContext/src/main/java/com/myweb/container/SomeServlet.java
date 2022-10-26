package com.myweb.container;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class SomeServlet implements Servlet {

    private ServletConfig servletConfig;

    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig=servletConfig;
        System.out.println("初始化servlet");
    }

    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("执行SomeServlet的service方法");

//        获取ServletContext对象
        ServletContext sc = servletConfig.getServletContext();

//        获取所有初始化参数名
        Enumeration<String> names = sc.getInitParameterNames();
        while (names.hasMoreElements()){
            String name = names.nextElement();
            String value = sc.getInitParameter(name);
            System.out.println(name + "=" + value);
        }

//        设置域属性
        sc.setAttribute("email", "abc@qq.com");
        sc.setAttribute("phone", "123456");

//        获取域属性的值
        String email = (String) sc.getAttribute("email");
        String phone = (String) sc.getAttribute("phone");

        System.out.println("email"+"="+email);
        System.out.println("phone"+"="+phone);

        String contextPath = sc.getContextPath();
        System.out.println("contextPath"+"="+contextPath);

        String realPath = sc.getRealPath("/webapp");
        System.out.println("realPath"+"="+realPath);
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("销毁SomeServlet");
    }
}
