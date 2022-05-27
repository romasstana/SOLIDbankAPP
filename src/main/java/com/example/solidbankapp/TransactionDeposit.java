package com.example.solidbankapp;

import com.example.solidbankapp.ACCOUNT.Account;
import com.example.solidbankapp.DAO.TransactionDAO;
import com.example.solidbankapp.DEPOSIT.AccountDepositService;
import com.example.solidbankapp.WITHDRAW.AccountWithdraw;
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
    void execute(Account account, double amount){
        accountDepositService.deposit(amount, account);
    }

    public static class Transaction {

    }
}
