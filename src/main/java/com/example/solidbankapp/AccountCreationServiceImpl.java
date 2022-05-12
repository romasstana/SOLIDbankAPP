package com.example.solidbankapp;

public class AccountCreationServiceImpl implements AccountCreationService{
    AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        Account account = null;
        switch (accountType){
            case FIXED:
                account = new FixedAccount(accountType,String.valueOf(bankID) , clientID, 0, false);
                System.out.println("Bank account created");
                break;
            case CHECKING:
                account = new CheckingAccount(accountType, String.valueOf(bankID), clientID, 0, true);
                System.out.println("Bank account created");
                break;
            case SAVING :
                account = new SavingAccount(accountType, String.valueOf(bankID), clientID, 0, true);
                System.out.println("Bank account created");
                break;
        }
        accountDAO.createNewAccount(account);

    }
}
