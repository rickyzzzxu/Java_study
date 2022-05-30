package src.main.java.com.ricky.dao.impl;

import com.ricky.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import src.main.java.com.ricky.dao.UserMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserMapperImpl implements UserMapper {
    public List<User> findAll() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> userList = sqlSession.selectList("userMapper.findAll");

        sqlSession.close();

        return userList;

    }
}
