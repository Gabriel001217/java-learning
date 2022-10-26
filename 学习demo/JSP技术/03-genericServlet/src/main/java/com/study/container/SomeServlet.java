package com.study.container;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class SomeServlet extends GenericServlet{

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("执行SomeServlet的service()方法");
        String param = this.getInitParameter("name");
        System.out.println(param);

        String servletName = this.getServletName();
        System.out.println(servletName);

    }

    //重写父类的无参init()方法
    public void init(){
        System.out.println("----------------------");
    }
}
