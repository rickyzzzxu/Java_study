package com.ricky.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ricky.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    void testGetById() {
        System.out.println(bookService.getById(2));
    }

    @Test
    void testGetAll() {
        System.out.println(bookService.getAll());
    }

    @Test
    void testGetPage() {
        IPage<Book> page = bookService.getPage(1, 2);
        System.out.println("总数：" + page.getTotal());
        System.out.println("当前页：" + page.getCurrent());
    }
}
