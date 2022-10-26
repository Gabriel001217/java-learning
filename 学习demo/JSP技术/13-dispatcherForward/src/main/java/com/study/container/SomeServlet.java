package com.study.container;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

//无论是forward()还是include()，对于请求来说，都是一样的
//他们的不同点主要集中在响应对象

public class SomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

/*        System.out.println("request = "+req);
        System.out.println("response = "+resp);*/

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter();
        out.print("SomeServlet:forward()之前<br>");

        //forward()与include()的区别，主要表现在标准输出流的开启时间不同
        //forward():forward这个单词表示的意思是“向前”，说明当前的请求还未结束，需要继续向前。所以服务器就不会在这里
        //          先打开标准输出流。所以此时写入到out中的数据是不会写入到客户端浏览器中的。
        //          使用forward()方法的Servlet，其标准输出流还未开启。
        //          对客户端的响应肯定不是使用forward()方法的servlet给出的

        //include():include这个单词表示的意思是”包含”，说明当前的请求已经结束，可以对客户端进行响应了。
        //          其不仅将自己的数据写入到了标准输出流，还要将其他数据包含到自己的输出流中。
        //          使用include()方法的servlet，其标准输出流已经打开
        //          对客户端的响应是由使用include()方法的servlet给出的

        //结论：在使用forward()进行请求转发是，使用forward()的servlet不应向response中写入数据
        //      要写入数据则应使用include()进行转发
//        req.getRequestDispatcher("other").forward(req, resp);
        req.getRequestDispatcher("other").include(req, resp);

        out.print("SomeServlet:forward()之前<br>");
    }
}
