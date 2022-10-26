package com.gabriel.service;

import com.gabriel.pojo.Admin;

public interface AdminService {

    Admin queryAdmin(String username, String password);
}
