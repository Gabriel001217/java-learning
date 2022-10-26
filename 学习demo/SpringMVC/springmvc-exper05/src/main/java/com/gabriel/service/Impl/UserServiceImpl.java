package com.gabriel.service.Impl;

import com.gabriel.mapper.UserMapper;
import com.gabriel.pojo.User;
import com.gabriel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public User queryUser(String username, String password) {
        return userMapper.queryUser(username, password);
    }

    public List<User> queryAll() {
        return userMapper.queryAll();
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public int delUser(String username) {
        return 0;
    }
}
