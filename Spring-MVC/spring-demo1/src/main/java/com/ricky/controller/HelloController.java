package com.ricky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index() {
        // 返回的视图
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget() {

        return "target";
    }
}
