package com.ricky.service.impl;

import com.ricky.dao.UserDao;
import com.ricky.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    // set注入
    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    // 构造器注入
    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}
