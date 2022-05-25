package com.ricky.service.impl;

import com.ricky.dao.UserDao;
import com.ricky.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//<bean id="userService" class="com.ricky.service.impl.UserServiceImpl">
//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {

    @Value("${jdbc.url}")
    private String url;

    //<property name="userDao" ref="userDao"/>
    //@Autowired  // 按类型注入
    //@Qualifier("userDao")  按照id从容器中匹配（按名称注入）
    @Resource(name = "userDao")  // 相当于@Autowired + @Qualifier("userDao")(按名称注入)
    private UserDao userDao;

    // set注入
    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public void save() {
        System.out.println(url);
        userDao.save();
    }

}
