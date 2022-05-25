package com.example.solidbankapp.DAO;

import com.example.solidbankapp.Account;
import com.example.solidbankapp.AccountType;
import com.example.solidbankapp.AccountWithdraw;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDAO extends CrudRepository<Account, Integer> {
    @Query("SELECT * from Account where clientId=:clientId")
    List<Account> getClientAccounts(String clientID);
    void createNewAccount(Account account);
    void updateAccount(Account account);
    List<Account> getClientAccountsByType(String clientID, AccountType accountType);
    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);
    Account getClientAccount(String clientID, String accountID);
}
