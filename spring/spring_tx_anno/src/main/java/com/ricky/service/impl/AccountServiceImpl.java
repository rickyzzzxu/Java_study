package com.ricky.service.impl;

import com.ricky.dao.AccountDao;
import com.ricky.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
@Transactional(isolation = Isolation.DEFAULT)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    // 类上也配置事务注解时，以方法上的为主
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public void transfer(String outMan, String inMan, double money) {
        accountDao.out(outMan,money);
        accountDao.in(inMan,money);
    }
}
