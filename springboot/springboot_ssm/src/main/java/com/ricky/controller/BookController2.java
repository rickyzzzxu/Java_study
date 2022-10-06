package com.ricky.controller;

import com.ricky.controller.utils.R;
import com.ricky.domain.Book;
import com.ricky.service.impl.IBookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController2 {

    @Autowired
    private IBookServiceImpl iBookService;

    @GetMapping
    public R getAll() {
        return new R(true, iBookService.list());
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, iBookService.getById(id));
    }

    @DeleteMapping("/{id}")
    public R deleteById(@PathVariable Integer id) {
        return new R(iBookService.removeById(id));
    }

    @GetMapping("/{currentPage}/{PageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int PageSize) {
        return new R(true, iBookService.getPage(currentPage, PageSize));
    }

    @PostMapping
    public R save(@RequestBody Book book) {
        return new R(iBookService.save(book));
    }

    @PutMapping
    public R update(@RequestBody Book book) {
        return new R(iBookService.updateById(book));
    }

}
