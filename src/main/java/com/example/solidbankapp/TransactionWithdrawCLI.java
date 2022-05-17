package com.example.solidbankapp;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TransactionWithdrawCLI {

    TransactionWithdraw transactionWithdraw;
    WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    AccountListingService accountListingService;

    public TransactionWithdrawCLI(TransactionWithdraw transactionWithdraw, WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI, AccountListingService accountListingService) {
        this.transactionWithdraw = transactionWithdraw;
        this.withdrawDepositOperationCLIUI = withdrawDepositOperationCLIUI;
        this.accountListingService = accountListingService;
    }
    public void withdrawMoney(String clientID){
        String accountId = withdrawDepositOperationCLIUI.requestClientAccountNumber();
        double amount = withdrawDepositOperationCLIUI.requestClientAmount();
        AccountWithdraw accountWithdraw = accountListingService.getClientWithdrawAccount(clientID, accountId);
        transactionWithdraw.execute(accountWithdraw, amount);
    }
}
