package src.main.java.com.ricky.dao;

import com.ricky.domain.User;

import java.io.IOException;
import java.util.List;

public interface UserMapper {

    List<User> findAll() throws IOException;
}
