package com.fkp.spring.demo.service.impl;

import com.fkp.spring.demo.dao.UserDao;
import com.fkp.spring.demo.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("UserServiceImpl 被创建了");
    }

    @Override
    public void func() {
        System.out.println("UserServiceImpl...");
        userDao.save();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
