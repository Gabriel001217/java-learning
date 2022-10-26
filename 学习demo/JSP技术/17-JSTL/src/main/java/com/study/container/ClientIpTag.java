package com.study.container;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class ClientIpTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {

        //获取PageContext对象
        PageContext pc= (PageContext) this.getJspContext();
        //获取请求对象
        ServletRequest request = pc.getRequest();
        //获取客户端ip
        String remoteAddr = request.getRemoteAddr();
        //获取标准输出流
        JspWriter out = pc.getOut();
        //将客户端ip写入到标准输出流中
        out.print(remoteAddr);
    }
}
