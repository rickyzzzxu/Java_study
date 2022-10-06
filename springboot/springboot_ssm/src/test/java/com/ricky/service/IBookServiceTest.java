package com.ricky.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ricky.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IBookServiceTest {

    @Autowired
    private IBookService bookService;

    @Test
    void testGetById() {
        System.out.println(bookService.getById(11));
    }

    @Test
    void testGetAll() {
        System.out.println(bookService.list());
    }

    @Test
    void testGetPage() {
        IPage<Book> page = new Page<>(2,4);
        bookService.page(page);
        System.out.println("总数：" + page.getTotal());
        System.out.println("当前页：" + page.getCurrent());
    }
}
