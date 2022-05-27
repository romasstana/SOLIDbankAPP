package com.example.solidbankapp.DAO;

import com.example.solidbankapp.TransactionDeposit;

import java.util.List;

public interface TransactionDAO {
    List<TransactionDeposit.Transaction> getTransactions();
    void addTransaction(TransactionDeposit.Transaction transaction);
}
