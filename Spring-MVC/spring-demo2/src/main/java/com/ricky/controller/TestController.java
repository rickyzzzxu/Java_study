package com.ricky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "test_param";
    }

    @RequestMapping("param")
    public String param() {
        return "test_param";
    }

}
