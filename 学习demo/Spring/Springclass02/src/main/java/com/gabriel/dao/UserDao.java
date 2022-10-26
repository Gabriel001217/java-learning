package com.gabriel.dao;

import com.gabriel.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    public void insert(User user){
        System.out.println("userDao");
    }
}
