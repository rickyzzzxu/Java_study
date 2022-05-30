package com.ricky.service;

import com.ricky.exception.MyException;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class DemoServiceImpl implements com.ricky.service.DemoService {
    public void show1() {
        System.out.println("抛出类型转换异常....");
        Object str = "zhangsan";
        Integer num = (Integer)str;
    }

    public void show2() {
        System.out.println("抛出除零异常....");
        int i = 1/0;
    }

    public void show3() throws FileNotFoundException {
        System.out.println("文件找不到异常....");
        InputStream in = new FileInputStream("C:/xxx/xxx/xxx.txt");
    }

    public void show4() {
        System.out.println("空指针异常.....");
        String str = null;
        str.length();
    }

    public void show5() throws MyException {
        System.out.println("自定义异常....");
        throw new MyException();
    }
}
