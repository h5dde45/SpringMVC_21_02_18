package com.springmvc_21_02_18.service;

import com.springmvc_21_02_18.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void delete(int id);

    void save(User user);

    void update(User user);

    User getById(int id);
}
