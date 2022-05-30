package com.ricky.service;

import com.ricky.domain.Account;

import java.util.List;

public interface AccountService {

    public void save(Account account);

    public List<Account> findAll();

}
