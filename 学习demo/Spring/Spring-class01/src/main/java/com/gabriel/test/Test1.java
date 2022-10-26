package com.gabriel.test;

import com.gabriel.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        //已经将userDao对象交给spring管理
        //从spring容器中，获取bean对象
        //每次调用都会产生新的容器对象
        //ClassPathXmlApplicationContext参数：String、String...、String[]一个或者多个xml配置文件
        ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //
        UserDao userDao= (UserDao) ctx.getBean("userDao");
        userDao.insert(null);

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
