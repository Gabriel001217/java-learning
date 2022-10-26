package com.study.container;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class LowerToUpper extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {

        //创建一个输出流，该流中的内容可通过其toString()方法获取到其文本形式
        StringWriter sw = new StringWriter();
        //获取标签体对象
        JspFragment jspBody = this.getJspBody();
        //将标签体内容写入到输出流
        jspBody.invoke(sw);
        //以文本的形式获取到输出流中的内容
        String str = sw.toString();
        //小写变大写
        str=str.toUpperCase();
        //获取标签输出流
        JspWriter out = this.getJspContext().getOut();
        out.print(str);
    }
}
