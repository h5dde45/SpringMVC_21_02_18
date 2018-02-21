package com.springmvc_21_02_18.service;

import com.springmvc_21_02_18.dao.UserDao;
import com.springmvc_21_02_18.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
