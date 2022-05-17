package com.example.solidbankapp;

import org.springframework.stereotype.Component;

@Component
public class AccountDepositServiceImpl implements  AccountDepositService{
    AccountDAO accountDAO;

    public AccountDepositServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public void deposit(double amount, Account account){
        account.setBalance(account.getBalance()+amount);

    }
}
