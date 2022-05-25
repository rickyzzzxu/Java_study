package com.ricky.dao.impl;

import com.ricky.dao.UserDao;
import com.ricky.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {

    private String username;
    private int age;

    private List<String> strList;
    private Map<String, User> map;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private Properties properties;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public UserDaoImpl() {
    }

    public void save() {

        System.out.println(strList);
        System.out.println(map);
        System.out.println(properties);

        //System.out.println(username + "===" + age);
        System.out.println("save running...");
    }
}
