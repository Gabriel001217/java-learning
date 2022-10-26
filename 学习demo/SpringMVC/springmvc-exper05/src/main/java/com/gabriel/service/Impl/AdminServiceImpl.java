package com.gabriel.service.Impl;

import com.gabriel.mapper.AdminMapper;
import com.gabriel.pojo.Admin;
import com.gabriel.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public Admin queryAdmin(String username, String password) {
        return adminMapper.queryAdmin(username, password);
    }
}
