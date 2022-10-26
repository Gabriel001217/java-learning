package com.study.container;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineUserListener implements HttpSessionListener {

    int count=0;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        ServletContext servletContext = session.getServletContext();
        count++;
        servletContext.setAttribute("count", count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        ServletContext servletContext = session.getServletContext();
        count--;
        servletContext.setAttribute("count", count);
    }
}
