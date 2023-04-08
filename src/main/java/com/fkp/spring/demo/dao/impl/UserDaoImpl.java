package com.fkp.spring.demo.dao.impl;

import com.fkp.spring.demo.dao.UserDao;

public class UserDaoImpl implements UserDao {

    private String name;

    public UserDaoImpl() {
        System.out.println("UserDaoImpl被创建了");
    }

    @Override
    public void save() {
        System.out.println("name: " + name + "    UserDaoImpl...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
