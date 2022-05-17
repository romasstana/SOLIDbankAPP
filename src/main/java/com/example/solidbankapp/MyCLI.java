package com.example.solidbankapp;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MyCLI implements CLIUI{
    Scanner scanner;

    public MyCLI(Scanner scanner) {
        this.scanner = scanner;
    }
    MyCLI() {
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public double requestClientAmount(){
        return 0;
    }
    public String requestClientAccountNumber(){
        return "";
    }
    @Override
    public AccountType requestAccountType(){
        switch(scanner.next()){
            case "FIXED": return AccountType.FIXED;
            case "CHECKING":  return AccountType.CHECKING;
            case "SAVING":  return AccountType.SAVING;
        }
        return null;
    }

}
