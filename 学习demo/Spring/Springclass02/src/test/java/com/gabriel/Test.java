package com.gabriel;

import com.gabriel.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userServiceImpl;

    @org.junit.Test
    public void test01(){
        userServiceImpl.save();
    }
}
