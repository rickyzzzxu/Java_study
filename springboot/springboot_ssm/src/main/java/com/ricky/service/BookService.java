package com.ricky.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ricky.domain.Book;

import java.util.List;

public interface BookService {
    boolean save(Book book);

    boolean delete(Integer id);

    boolean update(Book book);

    Book getById(Integer id);

    List<Book> getAll();

    IPage<Book> getPage(int currentPage, int pageSize);
}
