package com.ricky.web;

import com.ricky.config.SpringConfiguration;
import com.ricky.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserController {

    public static void main(String[] args) {

        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        UserService userService = (UserService) applicationContext.getBean("userService");

        //UserService userService = applicationContext.getBean(UserService.class);

        userService.save();
    }
}
