package com.ricky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String selectUsers() {
        System.out.println("查询所有");
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String selectById() {
        System.out.println("根据id查询");
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String add() {
        System.out.println("添加用户");
        return "success";
    }

    // 派生注解
    @PutMapping("/user")
    public String delete() {
        System.out.println("修改用户");
        return "success";
    }

}
