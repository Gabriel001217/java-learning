package com.gabriel.beanFactory;

public class Bean2 {

    private Bean2(){
    }

    public static Bean2 getInstance(){
        System.out.println("静态工厂方法");
        return new Bean2();
    }
}
