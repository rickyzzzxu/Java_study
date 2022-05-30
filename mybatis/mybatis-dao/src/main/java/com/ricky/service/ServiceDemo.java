package src.main.java.com.ricky.service;

import com.ricky.domain.User;
import src.main.java.com.ricky.dao.UserMapper;
import src.main.java.com.ricky.dao.impl.UserMapperImpl;

import java.io.IOException;
import java.util.List;

public class ServiceDemo {

    public static void main(String[] args) throws IOException {

        UserMapper userMapper = new UserMapperImpl();
        List<User> userList = userMapper.findAll();

        System.out.println(userList);
    }
}
