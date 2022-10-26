package com.study.container;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SessionAttributeListener implements HttpSessionAttributeListener {

    Map<String,Date> map=new HashMap<>();
    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

    }
}
