package com.ricky.json;

import com.alibaba.fastjson.JSON;

public class FastJsonDemo {

    public static void main(String[] args) {

        User user = new User();
        user.setId(1);
        user.setUsername("zhangsan");
        user.setPassword("123456");

        String string = JSON.toJSONString(user);
        System.out.println(string);

        System.out.println("================");

        User u = JSON.parseObject("{\"id\":1,\"password\":\"123456\",\"username\":\"zhangsan\"}", User.class);
        System.out.println(u);

    }

}
