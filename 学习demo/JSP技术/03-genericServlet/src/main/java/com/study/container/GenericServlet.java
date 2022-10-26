package com.study.container;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

//缺省适配器设计模式
public abstract class GenericServlet implements Servlet {

    private ServletConfig servletConfig;

    //模板方法设计模式
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig=servletConfig;
        this.init();
        System.out.println("=====================");
    }

    //该无参init()方法就是要让子类来重写的
    public void init(){

    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    //抽象方法，专门让子类实现
    @Override
    public abstract void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException;

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

    public String getInitParameter(String name){
        return servletConfig.getInitParameter(name);
    }

    public Enumeration<String> getInitParameterNames(){
        return servletConfig.getInitParameterNames();
    }

    public ServletContext getServletContext(){
        return servletConfig.getServletContext();
    }

    public String getServletName(){
        return servletConfig.getServletName();
    }
}
