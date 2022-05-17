package com.example.solidbankapp;

import org.springframework.stereotype.Component;

@Component
public class TransactionDeposit {
    AccountDepositService accountDepositService;
    TransactionDAO transactionDAO;

    public TransactionDeposit(AccountDepositService accountDepositService, TransactionDAO transactionDAO) {
        this.accountDepositService = accountDepositService;
        this.transactionDAO = transactionDAO;
    }

    void execute(AccountWithdraw accountWithdraw, AccountWithdraw accountWithdraw2, double amount){

    }
    void execute(AccountWithdraw accountWithdraw, double amount){
        accountDepositService.deposit(amount, accountWithdraw);
    }
}
