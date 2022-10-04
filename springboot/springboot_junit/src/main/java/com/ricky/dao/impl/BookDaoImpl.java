package com.ricky.dao.impl;

import com.ricky.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("bookdao is running ...");
    }
}
