package com.example.solidbankapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MemoryTransactionDAO implements  TransactionDAO{
    List<Transaction> transactions;
    @Override
    public List<Transaction> getTransactions() {
        return null;
    }

    @Override
    public void addTransaction(Transaction transaction) {

    }

}
