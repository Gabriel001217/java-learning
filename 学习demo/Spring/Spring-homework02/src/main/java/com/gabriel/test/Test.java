package com.gabriel.test;

import com.gabriel.controller.Control;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

    public static void main(String[] args) throws Exception {
        ApplicationContext apc=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Control control= (Control) apc.getBean("control");

        control.play();
    }
}
