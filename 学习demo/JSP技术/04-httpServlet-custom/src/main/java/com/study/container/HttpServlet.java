package com.study.container;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HttpServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("=================");

        System.out.println(servletRequest.getClass().getName());
        //多态：分为上转型和下转型
        //上转型：将子类引用赋值给父类
        //下转型：将父类引用赋值给子类。但java中是不支持真正的下转型的。但若父类对象本身是由子类对象上转型而来的，那么，可以通过强转的方式，将其赋值给子类对象。
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        HttpServletResponse response= (HttpServletResponse) servletResponse;

        //获取请求的提交方式
        String method=request.getMethod();
        System.out.println(method);

        if ("POST".equals(method)){
            doPost(request,response);
        }else{
            doGet(request,response);
        }
    }

    private void doGet(HttpServletRequest request, HttpServletResponse response) {
    }

    private void doPost(HttpServletRequest request, HttpServletResponse response) {
    }
}
