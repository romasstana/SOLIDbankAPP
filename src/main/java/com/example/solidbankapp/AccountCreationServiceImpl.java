package com.example.solidbankapp;

import com.example.solidbankapp.DAO.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountCreationServiceImpl implements AccountCreationService{
    AccountDAO accountDAO;
    @Autowired
    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        Account account = null;
        switch (accountType){
            case FIXED:
                account = new FixedAccount(accountType, String.format("%03d%06d", 1, accountID), clientID, 0, false);
                System.out.println("Bank account created");
                break;
            case CHECKING:
                account = new CheckingAccount(accountType, String.format("%03d%06d", 1, accountID), clientID, 0, true);
                System.out.println("Bank account created");
                break;
            case SAVING :
                account = new SavingAccount(accountType, String.format("%03d%06d", 1, accountID), clientID, 0, true);
                System.out.println("Bank account created");
                break;
        }
        accountDAO.createNewAccount(account);

    }
}
