package com.study.container;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    private void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("GET请求");
    }

    private void doPost(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("POST请求");
    }
}
