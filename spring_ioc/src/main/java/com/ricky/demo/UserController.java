package com.ricky.demo;

import com.ricky.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //UserService userService = (UserService) applicationContext.getBean("userService");

        UserService userService = applicationContext.getBean(UserService.class);

        userService.save();
    }
}
