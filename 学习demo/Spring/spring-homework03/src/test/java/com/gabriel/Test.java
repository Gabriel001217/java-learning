package com.gabriel;

import com.gabriel.entity.User;
import com.gabriel.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class Test {

    @Autowired
    private UserService userService;

    @org.junit.Test
    public void testQuery(){

        List<User> users = userService.query();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void testDel(){

        int count = userService.modify(7);
        System.out.println(count);
    }

    @org.junit.Test
    public void testAdd(){

        User user=new User(8,"zheng","男","qqq@126.com");
        int count=userService.add(user);
        System.out.println(count);
    }

    @org.junit.Test
    public void testUpdate(){

        User user=new User(8,"jia","女","qqq@126.com");
        int count=userService.update(user);
        System.out.println(count);
    }
}
