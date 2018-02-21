package com.springmvc_21_02_18.service;

import com.springmvc_21_02_18.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
