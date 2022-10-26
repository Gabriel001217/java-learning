package com.gabriel.test;

import com.gabriel.beanFactory.Bean2;
import com.gabriel.beanFactory.Bean3;
import com.gabriel.entity.User;
import com.gabriel.life.LifeCycle;
import com.gabriel.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;

public class Test2 {

    public static void main(String[] args) {

        ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");

//       DI依赖注入
        UserService service= (UserService) ctx.getBean("userService");
//        属性注入
        User user= (User) ctx.getBean("user");
//        构造器注入
        User user1= (User) ctx.getBean("user1");
//        静态工厂方法实例化bean
        Bean2 bean2= (Bean2) ctx.getBean("bean2");
//        实例工厂方法实例化bean
        Bean3 bean3= (Bean3) ctx.getBean("bean3");
//        实例工厂方法注入日期
        User user4= (User) ctx.getBean("user4");
//        bean的生命周期
        LifeCycle lif= (LifeCycle) ctx.getBean("lifeCycle");

        System.out.println(user);
        System.out.println(user1);
        System.out.println("bean2="+bean2.hashCode());
        System.out.println("bean3="+bean3.hashCode());
        System.out.println("birth="+ new SimpleDateFormat().format(user4.getBirth()));

        service.save();
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
