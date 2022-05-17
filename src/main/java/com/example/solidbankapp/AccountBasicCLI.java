package com.example.solidbankapp;

import org.springframework.stereotype.Component;

@Component
public class AccountBasicCLI{
    CreateAccountOperationUI createAccountOperationUI;
    BankCore bankCore;
    AccountListingService accountListing;

    public AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListing) {
        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListing = accountListing;
    }

    public void createAccountRequest(String clientID){
        bankCore.createNewAccount(createAccountOperationUI.requestAccountType(),clientID);
    }
    public void getAccounts(String clientID){
        System.out.println(accountListing.getClientAccounts(clientID));
    }



}
