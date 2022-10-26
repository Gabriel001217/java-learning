package com.gabriel.mapper;

import com.gabriel.pojo.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {

    Admin queryAdmin(@Param("adminname") String username, @Param("password") String password);
}
