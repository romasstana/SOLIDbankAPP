package com.example.solidbankapp.DAO;

import com.example.solidbankapp.Transaction;

import java.util.List;

public interface TransactionDAO {
    List<Transaction> getTransactions();
    void addTransaction(Transaction transaction);
}
