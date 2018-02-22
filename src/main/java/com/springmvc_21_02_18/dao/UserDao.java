package com.springmvc_21_02_18.dao;

import com.springmvc_21_02_18.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    void delete(int id);

    void save(User user);

    void update(User user);

    User getById(int id);
}
