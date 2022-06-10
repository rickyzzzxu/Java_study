package com.ricky;

import com.ricky.autowire.Emp;
import com.ricky.bean.Orders;
import com.ricky.pojo.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void demo1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Stu stu1 = (Stu) ac.getBean("stu");
        Stu stu2 = (Stu) ac.getBean("stu");
        System.out.println(stu1);
        System.out.println(stu2);
    }

    @Test
    public void demo2() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Orders orders = (Orders) ac.getBean("orders");
        System.out.println("第四步：获取bean的实例化对象");
        System.out.println(orders);
        ac.close();
    }

    @Test
    public void demo3() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Emp emp = ac.getBean(Emp.class);
        System.out.println(emp);

    }

}
