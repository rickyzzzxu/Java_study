package com.ricky.pojo;

//课程类
public class Course {
    private String cname; //课程名称
    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
