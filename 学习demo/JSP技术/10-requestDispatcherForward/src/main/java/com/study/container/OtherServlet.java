package com.study.container;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class OtherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        out.write("This is otherServlet.");

        String attrName = (String) req.getAttribute("attrName");
        String attrAge = (String) req.getAttribute("attrAge");

        System.out.println("attrName ==="+attrName);
        System.out.println("attrAge ==="+attrAge);
    }
}
