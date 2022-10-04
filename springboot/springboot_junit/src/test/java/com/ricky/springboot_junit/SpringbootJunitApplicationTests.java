package com.ricky.springboot_junit;

import com.ricky.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJunitApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        bookDao.save();
    }

}
