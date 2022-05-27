package com.ricky.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

// 切面，用来增强的方法（增强的部分）
@Component("myAspect")
// 标明该类是切面类
@Aspect
public class MyAspect {

    @Before(value = "execution(* com.ricky.anno.*.*(..))")
    public void before() {
        System.out.println("前置增强.....");
    }

    @AfterReturning("execution(* com.ricky.anno.*.*(..))")
    public void afterReturning() {
        System.out.println("后置增强.....");
    }

    @Around("execution(* com.ricky.anno.*.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强...");
        Object proceed = pjp.proceed();
        System.out.println("环绕后增强...");
        return proceed;
    }

    @AfterThrowing("execution(* com.ricky.anno.*.*(..))")
    public void afterThrowing(){
        System.out.println("异常抛出增强........");
    }

    //@After("execution(* com.ricky.anno.*.*(..))")
    //@After("pointcut()")
    @After("MyAspect.pointcut()")
    public void after(){
        System.out.println("最终增强.......");
    }

    // 定义切点表达式
    @Pointcut("execution(* com.ricky.anno.*.*(..))")
    public void pointcut(){}

}
