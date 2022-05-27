package com.example.solidbankapp.DAO;

import com.example.solidbankapp.TransactionDeposit;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class MemoryTransactionDAO implements TransactionDAO {
    List<TransactionDeposit.Transaction> transactions;
    @Override
    public List<TransactionDeposit.Transaction> getTransactions() {
        return null;
    }

    @Override
    public void addTransaction(TransactionDeposit.Transaction transaction) {

    }

}
