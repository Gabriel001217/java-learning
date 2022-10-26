package com.study.container;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineUserCounterListener implements HttpSessionListener {
    int counter=0;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        counter++;
        System.out.println("one session created,current users counter:"+counter);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        counter--;
        System.out.println("one session destroy,current users counter:"+counter);
    }
}
