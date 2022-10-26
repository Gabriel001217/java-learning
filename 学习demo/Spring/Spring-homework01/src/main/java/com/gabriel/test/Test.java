package com.gabriel.test;

import com.gabriel.pojo.Car;
import com.gabriel.service.CarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Car car1= (Car) ctx.getBean("car1");
        Car car2= (Car) ctx.getBean("car2");
        Car car3= (Car) ctx.getBean("car3");
        ArrayList carList = (ArrayList) ctx.getBean("carList");
        CarService carService= (CarService) ctx.getBean("carService");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(carList);

        carService.play();

        System.out.println(carList);

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
