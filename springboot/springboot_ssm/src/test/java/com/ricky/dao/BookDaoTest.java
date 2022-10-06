package com.ricky.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(2));
    }

    @Test
    void testPage() {
        IPage page = new Page(1,2);
        bookDao.selectPage(page,null);
        System.out.println(page.getCurrent());
        System.out.println(page.getRecords());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
    }
}
