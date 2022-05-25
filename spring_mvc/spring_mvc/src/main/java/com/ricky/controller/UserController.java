package com.ricky.controller;

import com.alibaba.fastjson.JSON;
import com.ricky.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RequestMapping("/user")
@Controller
public class UserController {

    @RequestMapping("/quick2")
    public ModelAndView save2() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/jsp/success.jsp");
        modelAndView.addObject("username","zhangsan");

        return modelAndView;
    }


    @RequestMapping("/quick3")
    public ModelAndView save3() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/jsp/success.jsp");
        modelAndView.addObject("username","zhangsan");

        return modelAndView;
    }

    @RequestMapping(value = "/quick",method = RequestMethod.GET)
    public String save() {
        System.out.println("mvc执行...");
        return "/jsp/success.jsp";
    }

    @RequestMapping("/quick6")
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello ricky");
    }

    @RequestMapping("/quick7")
    // 告知SpringMVC框架不进行视图跳转,直接进行数据响应
    @ResponseBody
    public String save7() {
        return "hello ricky...";
    }

    @RequestMapping("/quick9")
    // 告知SpringMVC框架不进行视图跳转,直接进行数据响应
    @ResponseBody
    public String save9() {

        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(18);

        String jsonString = JSON.toJSONString(user);

        return jsonString;
    }

    @RequestMapping("/quick10")
    @ResponseBody
    public User save10() {

        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(21);

        return user;
    }
}