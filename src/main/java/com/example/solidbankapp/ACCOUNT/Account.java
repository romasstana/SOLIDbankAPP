package com.example.solidbankapp.ACCOUNT;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "ACCOUNT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {


    private @Id String id;
    private String accountType;
    private String clientId;
    private double balance;
    private boolean withdrawAllowed;


    @Override
    public String toString() {

        return "Account{" +
                ", id='" + id + '\'' +
                ", clientID='" + clientId + '\'' +
                ", balance=" + balance +
                '}';
    }
}
