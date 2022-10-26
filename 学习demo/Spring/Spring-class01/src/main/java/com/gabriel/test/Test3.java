package com.gabriel.test;

import com.gabriel.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        ApplicationContext cxt= new ClassPathXmlApplicationContext("ApplicationContext_P.xml");

        User user= (User) cxt.getBean("user");
        System.out.println(user.toString());
    }
}
