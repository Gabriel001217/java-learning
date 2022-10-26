package com.study.container;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class IfTag extends SimpleTagSupport {

    private boolean gender;

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public void doTag() throws JspException, IOException {

        if (gender){
            //获取标签体
            JspFragment jspBody = this.getJspBody();
            //将标签体写入到标准输出流
            jspBody.invoke(this.getJspContext().getOut());
        }
    }
}
