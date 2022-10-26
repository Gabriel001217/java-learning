package com.study.container;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class OtherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        out.write("This is otherServlet.");

        String pname = req.getParameter("pname");
        //解码：组装
        pname= URLDecoder.decode(pname, "UTF-8");
        //再次进行编码解码
        pname= new String(pname.getBytes("ISO8859-1"),"UTF-8");

        String page = req.getParameter("page");

        System.out.println("pname ==="+pname);
        System.out.println("page ==="+page);
    }
}
