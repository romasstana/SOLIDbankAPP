package com.example.solidbankapp;

import org.springframework.stereotype.Component;

@Component
public class AccountWithdrawServiceImpl implements  AccountWithdrawService{
    AccountDAO accountDAO;


    public AccountWithdrawServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public void withdraw(double amount, AccountWithdraw account){
        double balance = account.getBalance();
        if(balance>=amount){
        account.setBalance(balance-amount);
        String str = String.format("%.2f", amount);
        System.out.println(str+"$ transferred from " + account.getId() + " account");
        }
    }
}
