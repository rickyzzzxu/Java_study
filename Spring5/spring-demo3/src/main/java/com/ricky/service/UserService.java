package com.ricky.service;

import com.ricky.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

// 可以不写Service(value = "userService")，默认会把类名首字母小写
@Service
public class UserService {

    @Value("zhangsan")
    private String name;

    // @Autowired根据类型注入
    //@Autowired
    // @Resource可以根据类型也可以根据名称注入
    @Resource(name = "userDaoImpl")
    private UserDao userDao;

    public void add() {
        System.out.println("service add......");
        System.out.println("name:" + name);
        userDao.add();
    }

}
