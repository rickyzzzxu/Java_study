package com.ricky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/hello")
public class RequestMappingController {

    @RequestMapping(
            value = {"/testRequestMapping", "/test"},
            method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE}
    )
    public String success() {
        return "success";
    }

    @GetMapping("/testGetMapping")
    public String testGetMapping() {
        return "success";
    }

    @RequestMapping(
            value = "/testParamsAndHeaders",
            params = {"username=admin", "password=123"},
            headers = {"Host=localhost:9000"}
    )
    public String testParamsAndHeaders() {
        return "success";
    }

    //@RequestMapping("/a?a/testAnt")
    //@RequestMapping("/a*a/testAnt")
    @RequestMapping("/**/testAnt")
    public String testAnt() {
        return "success";
    }

    @RequestMapping("/testPath/{id}/{name}")
    public String testPath(@PathVariable("id") Integer id, @PathVariable("name") String username) {
        System.out.println("id:" + id);
        System.out.println("username:" + username);
        return "success";
    }

}
