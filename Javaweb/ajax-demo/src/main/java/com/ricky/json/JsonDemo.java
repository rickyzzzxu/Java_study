package com.ricky.json;

import com.alibaba.fastjson.JSON;

public class JsonDemo {

    public static void main(String[] args) {

        User user = new User();
        user.setId(1);
        user.setUsername("zhangsan");
        user.setPassword("123456");

        String toJSONString = JSON.toJSONString(user);
        System.out.println(toJSONString);

        User parseObject = JSON.parseObject(toJSONString, User.class);
        System.out.println("==============================");
        System.out.println(parseObject);
    }
}
