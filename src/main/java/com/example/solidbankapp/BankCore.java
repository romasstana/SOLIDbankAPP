package com.example.solidbankapp;

import org.springframework.stereotype.Component;

@Component
public class BankCore {
    static long id = 1;
    long lastAccountNumber = 1;
    AccountCreationService accountCreation;

    public BankCore(AccountCreationService accountCreation) {
        this.accountCreation = accountCreation;
    }

    public BankCore() {
    }

    public void createNewAccount(AccountType accountType, String clientID){
        accountCreation.create(accountType, id, clientID, lastAccountNumber);
        incrementLastAccountNumber();
    }
    private void incrementLastAccountNumber(){
        lastAccountNumber++;
    }
}
