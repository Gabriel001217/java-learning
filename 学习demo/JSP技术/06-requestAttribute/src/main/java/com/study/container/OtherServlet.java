package com.study.container;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.util.Enumeration;

public class OtherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //从请求中获取了指定名称的域属行
        String name= (String) req.getAttribute("name");
        String age = req.getAttribute("age").toString();
        System.out.println("name = "+name);
        System.out.println("age = "+age);

        //获取请求中的所有域属行名称
        Enumeration<String> names=req.getAttributeNames();
        while (names.hasMoreElements()){
            String eleName=names.nextElement();
            System.out.println(eleName+"========"+req.getAttribute(eleName));
        }
    }
}
