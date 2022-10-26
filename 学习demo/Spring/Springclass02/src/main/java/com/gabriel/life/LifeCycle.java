package com.gabriel.life;

public class LifeCycle {

    public LifeCycle(){
        System.out.println("构造方法");
    }

    public void init(){
        System.out.println("初始化方法");
    }

    public void destroy(){
        System.out.println("在销毁之前进行回收工作");
    }

    public void work(){
        System.out.println("正常处理逻辑方法");
    }
}
