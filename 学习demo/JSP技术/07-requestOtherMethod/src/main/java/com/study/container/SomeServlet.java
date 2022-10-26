package com.study.container;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取请求的URL
        StringBuffer requestURL=req.getRequestURL();
        System.out.println("requestURL === "+requestURL);

        //获取请求的URI:URL去掉请求协议以及主机的剩余部分
        String requestURI=req.getRequestURI();
        System.out.println("requestURI === "+requestURI);

        //获取当前web应用的根路径
        String contextPath=req.getContextPath();
        System.out.println("contextPath ==="+contextPath);

        //获取客户端IP
        String clintIP=req.getRemoteAddr();
        System.out.println("remoteAddr === "+clintIP);

        //URL中的精确部分
        String servletPath=req.getServletPath();
        System.out.println("servletPath === "+servletPath);

        String pathInfo=req.getPathInfo();
        System.out.println("pathInfo === "+pathInfo);
    }
}
