package com.gabriel.dao;

import com.gabriel.entity.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {

    public boolean insert(User user){
        System.out.println("userDao");
        return true;
    }
}
