package com.example.solidbankapp;

import com.example.solidbankapp.DAO.AccountDAO;
import org.springframework.stereotype.Component;

@Component
public class AccountDepositServiceImpl implements  AccountDepositService{
    AccountDAO accountDAO;

    public AccountDepositServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public void deposit(double amount, Account account){
        account.setBalance(account.getBalance()+amount);
        String str = String.format("%.2f", amount);
        System.out.println(str + "$ transferred to " + account.getId() + " account");
    }
}
