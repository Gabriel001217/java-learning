package com.study.container;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        //解决response的中文乱码问题
        //设置响应的MIME类型(video/mp4，image/jpg)
        //其中可以指定MIME的字符编码，即响应体的字符编码
        resp.setContentType("text/html;charset=UTF-8");

        //setCharacterEncoding()方法使用的前提是，之前必须要先使用setContentType()方法
        //setCharacterEncoding()方法用于修改ContentType的MIME类型字符编码
        //resp.setCharacterEncoding("UTF-8");

        //获取标准输出流
        PrintWriter writer=resp.getWriter();

        //向标准输出流中写入数据，那么客户端浏览器就会直接看到这些数据
        writer.append("abc");
        writer.append("def");

/*        writer.println("abc");
        writer.write("def");*/

        //对标准输出流的关闭，但是不手动关闭的话，服务器再销毁response对象的时候也会自动关闭
        writer.close();
    }
}
