package com.ricky.mapper;

import com.ricky.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User select(@Param("username") String username, @Param("password") String password);

    //@Select("select * from tb_user where username = #{username};")
    User selectByUsername(String username);

    //@Insert("insert into tb_user values (null, #{username}, #{password});")
    void add(User user);


}
