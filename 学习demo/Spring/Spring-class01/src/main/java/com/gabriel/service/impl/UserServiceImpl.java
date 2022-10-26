package com.gabriel.service.impl;

import com.gabriel.dao.UserDao;
import com.gabriel.entity.User;
import com.gabriel.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean save(){
        System.out.println("UserServiceImpl");
        return userDao.insert(null);
    }
}
