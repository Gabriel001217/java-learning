package com.gabriel.aspect;

public class MyAspect {

    public void before(){
        System.out.println("在核心组件之前增强");
    }

    public void after(){
        System.out.println("在核心组件之后增强");
    }
}
