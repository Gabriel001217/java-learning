package com.gabriel.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(* com.gabriel.service..*.*(..))")
    private void pointcut(){ }

    @Before("pointcut()")
    public void before(){
        System.out.println("在核心组件之前进行增强。。。");
    }

    @AfterReturning(value = "pointcut()",returning = "returnVal")
    public void afterRet(JoinPoint jp, Object returnVal){
        System.out.println(returnVal);
        System.out.println("在核心组件之后进行增强。。。");
    }

    @AfterThrowing(value = "pointcut()",throwing = "throwable")
    public void throwEx(JoinPoint jp,Throwable throwable){
        System.out.println("异常信息为："+throwable.getMessage());
        System.out.println("异常之后进行增强。。。");
    }

    @After(value = "pointcut()")
    public void after(){
        System.out.println("在核心组件之后进行增强。。。");
    }

}
