package com.ricky.test;

import com.ricky.bean.Emp;
import com.ricky.pojo.Student;
import com.ricky.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    @Test
    public void demo1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Student student = ac.getBean(Student.class);
        Student student = (Student) ac.getBean("student");
        System.out.println(student);

    }

    @Test
    public void demo2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ac.getBean("userService");
        userService.add();
    }

    @Test
    public void demo3() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Emp emp = (Emp) ac.getBean("emp");
        emp.add();
    }

}
