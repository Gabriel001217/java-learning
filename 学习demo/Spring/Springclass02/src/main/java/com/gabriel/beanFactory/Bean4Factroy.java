package com.gabriel.beanFactory;

import org.springframework.beans.factory.FactoryBean;

public class Bean4Factroy implements FactoryBean<Bean4> {
    @Override
    public Bean4 getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
