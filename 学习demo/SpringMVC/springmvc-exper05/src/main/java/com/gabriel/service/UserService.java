package com.gabriel.service;

import com.gabriel.pojo.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    User queryUser(String username, String password);

    List<User> queryAll();

    int updateUser(User user);

    int delUser(String username);
}
