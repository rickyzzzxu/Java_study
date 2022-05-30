package com.ricky.service.impl;

import com.ricky.domain.Account;
import com.ricky.mapper.AccountMapper;
import com.ricky.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;


    public void save(Account account) {
        accountMapper.save(account);
    }


    public List<Account> findAll() {
        return accountMapper.findAll();
    }
}
