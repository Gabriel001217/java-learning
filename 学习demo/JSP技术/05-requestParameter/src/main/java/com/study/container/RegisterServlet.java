package com.study.container;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

/*
 *  1、请求参数是存放在Map中的
 *  2、这个Map的key为请求参数的名称，为String类型
 *     这个Map的value为请求参数的所有值，为String[]类型
 *  3、使用最多的是getParameter方法，其等价于getParameterValues()[0]
 *
 *
 */
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //接收指定名称的请求参数
        String username=req.getParameter("username");
        Integer age=Integer.valueOf(req.getParameter("age"));
        String hobby=req.getParameterValues("hobby")[0];

        System.out.println("name = "+username);
        System.out.println("age = "+age);
        System.out.println("hobby = "+hobby);

        //获取所有请求参数名称
        Enumeration<String> names=req.getParameterNames();
        //遍历枚举
        while (names.hasMoreElements()){
            String eleName=names.nextElement();
            String eleValue=req.getParameter(eleName);
            System.out.println(eleName+"===="+eleValue);
        }

        //获取指定参数的所有值
        String[] hobbyList=req.getParameterValues("hobby");
        for (String h:hobbyList){
            System.out.println(h);
        }

        //获取存放请求参数的Map
        Map<String,String[]> map=req.getParameterMap();
        for (String key:map.keySet()){
            System.out.println(key+"=========="+req.getParameter(key));
        }
    }
}
