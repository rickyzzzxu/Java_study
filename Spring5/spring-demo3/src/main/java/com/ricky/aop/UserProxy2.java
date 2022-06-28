package com.ricky.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class UserProxy2 {

    @Before("execution(* com.ricky.aop.User.add(..))")
    public void before() {
        System.out.println("before2....");
    }

}
