package com.study.container;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.HashMap;
import java.util.Map;

public class SessionAttributeListener implements HttpSessionAttributeListener {
    Map<String,HttpSession> map=new HashMap<>();
    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {

        HttpSession session = httpSessionBindingEvent.getSession();
        ServletContext servletContext = session.getServletContext();
        String username= (String) session.getAttribute("username");
        System.out.println("username1="+username);
        map.put(username, session);
        servletContext.setAttribute("user", map);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

    }
}
