package com.example.solidbankapp;

import com.example.solidbankapp.ACCOUNT.Account;
import com.example.solidbankapp.DAO.TransactionDAO;
import com.example.solidbankapp.WITHDRAW.AccountWithdraw;
import com.example.solidbankapp.WITHDRAW.AccountWithdrawService;
import org.springframework.stereotype.Component;

@Component
public class TransactionWithdraw {
    AccountWithdrawService accountWithdrawService;
    TransactionDAO transactionDAO;

    public TransactionWithdraw(AccountWithdrawService accountWithdrawService, TransactionDAO transactionDAO) {
        this.accountWithdrawService = accountWithdrawService;
        this.transactionDAO = transactionDAO;
    }

    void execute(Account account, double amount){
        accountWithdrawService.withdraw(account, amount);
    }
}
