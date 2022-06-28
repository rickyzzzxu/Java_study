package com.ricky.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class UserProxy {

    @Pointcut("execution(* com.ricky.aop.User.add(..))")
    public void pointDemo() {

    }

    @Before("pointDemo()")
    public void before() {
        System.out.println("before...");
    }

    @After("execution(* com.ricky.aop.User.add(..))")
    public void After() {
        System.out.println("After...");
    }

    @Around("execution(* com.ricky.aop.User.add(..))")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around之前...");
        proceedingJoinPoint.proceed();
        System.out.println("Around之后...");
    }

    @AfterThrowing("execution(* com.ricky.aop.User.add(..))")
    public void AfterThrowing() {
        System.out.println("AfterThrowing...");
    }

    @AfterReturning("pointDemo()")
    public void AfterReturning() {
        System.out.println("AfterReturning...");
    }


}
