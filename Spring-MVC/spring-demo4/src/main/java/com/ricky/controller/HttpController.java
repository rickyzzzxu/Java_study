package com.ricky.controller;

import com.ricky.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;

@Controller
public class HttpController {

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody) throws UnsupportedEncodingException {
        String decode = URLDecoder.decode(requestBody, "UTF-8");
        System.out.println(decode);
        return "success";
    }

    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity) {
        URI url = requestEntity.getUrl();
        System.out.println(url);
        System.out.println(requestEntity.getHeaders());
        System.out.println(requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello, response");
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody() {
        return "Hello ResponseBody";
    }

    @RequestMapping("/testResponseUser")
    @ResponseBody
    public User testResponseUser() {
        return new User(1001, "admin", "123456", 19, "男");
    }

    @RequestMapping("/testAxios")
    @ResponseBody
    public String testAxios(String username, String password) {
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        return "hello, axios";
    }

}
