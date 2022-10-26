package com.gabriel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ArrayServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String array = req.getParameter("array");
        String[] arys = array.split(",");
        int maxNum=Integer.parseInt(arys[0]);
        for (String ary : arys) {
            if (Integer.parseInt(ary)>maxNum){
                maxNum=Integer.parseInt(ary);
            }
        }
        req.setAttribute("max", maxNum);
        req.getRequestDispatcher("Array2.jsp").forward(req, resp);
    }
}
