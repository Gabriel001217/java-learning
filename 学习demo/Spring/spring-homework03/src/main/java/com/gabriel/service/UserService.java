package com.gabriel.service;

import com.gabriel.dao.UserDao;
import com.gabriel.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true,rollbackFor = Exception.class,isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public List<User> query(){
        return userDao.findAll();
    }

    @Transactional(rollbackFor = Exception.class,isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public int add(User user){
        int count = userDao.add(user);
        return count;
    }

    @Transactional(rollbackFor = Exception.class,isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public int update(User user){
        int count = userDao.update(user);
        return count;
    }

    @Transactional(rollbackFor = Exception.class,isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public int modify(Integer uid){
        int count = userDao.del(uid);
        return count;
    }
}
