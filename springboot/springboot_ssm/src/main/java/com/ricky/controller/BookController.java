package com.ricky.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ricky.domain.Book;
import com.ricky.service.impl.IBookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookServiceImpl iBookService;

    @GetMapping
    public List<Book> getAll() {
        return iBookService.list();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
        return iBookService.getById(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Integer id) {
        return iBookService.removeById(id);
    }

    @GetMapping("/{currentPage}/{PageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage, @PathVariable int PageSize) {
        IPage<Book> page = iBookService.getPage(currentPage, PageSize);
        return page;
    }

}
