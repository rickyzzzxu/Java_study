package com.ricky.service.impl;

import com.ricky.dao.AccountDao;
import com.ricky.service.AccountService;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String outMan, String inMan, double money) {
        accountDao.out(outMan,money);
        accountDao.in(inMan,money);
    }
}
