package com.ricky.controller;

import com.alibaba.fastjson.JSON;
import com.ricky.domain.User;
import com.ricky.domain.Vo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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

    // 获取基本类型数据
    @RequestMapping("/demo1")
    @ResponseBody
    public void save1(String username, String age) {
        System.out.println(username);
        System.out.println(age);
    }

    // 获取pojo类型数据
    @RequestMapping("/demo2")
    @ResponseBody
    public void save2(User user) {
        System.out.println(user);
    }

    // 获取数组类型数据
    @RequestMapping("/demo3")
    @ResponseBody
    public void save3(String[] name) {
        System.out.println(Arrays.toString(name));
    }

    // 获取集合类型数据
    @RequestMapping("/demo4")
    @ResponseBody
    public void save4(Vo vo) {
        System.out.println(vo);
    }

    // 获取集合类型数据
    @RequestMapping("/demo5")
    @ResponseBody
    public void save5(@RequestBody List<User> userList) {
        System.out.println(userList);
    }

    // required用来指定是否非必须，defaultValue指定默认值
    @RequestMapping("/demo6")
    @ResponseBody
    public void save6(@RequestParam(value = "name", required = false, defaultValue = "ricky") String username) {
        System.out.println(username);
    }

    @RequestMapping("/demo7/{username}")
    @ResponseBody
    public void save7(@PathVariable(value = "username", required = true) String username) {
        System.out.println(username);
    }

}