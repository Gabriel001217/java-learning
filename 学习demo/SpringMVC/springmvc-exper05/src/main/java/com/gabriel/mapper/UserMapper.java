package com.gabriel.mapper;

import com.gabriel.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    int addUser(User user);

    User queryUser(@Param("username") String username,@Param("password") String oassword);

    List<User> queryAll();

    int updateUser(User user);

    int delUser(String username);
}
