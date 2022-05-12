package com.example.solidbankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class SoliDbankAppApplication {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
        AccountBasicCLI accountBasicCLI = context.getBean("accountBasicCLI", AccountBasicCLI.class);

        MyCLI mycli= new MyCLI();
        String clientID = "1";
        System.out.print("Welcome to CLI bank service. \n " +
                "Enter operation number:\n " +
                "1 - show accounts \n " +
                "2 - create account \n " +
                "3 - deposit \n 4 - withdraw" +
                " \n 5- transfer \n " +
                "6 - this message \n " +
                "7 - exit\n");
        while(true){

            String input=mycli.scanner.nextLine();
            if(input.equals("1")){
                accountBasicCLI.getAccounts(clientID);
            }
            else if(input.equals("2")){
                System.out.print("Choose account type\n [CHECKING, SAVING, FIXED]\n");
                accountBasicCLI.createAccountRequest("1");
            } else if (input.equals("6")) {
                System.out.print("Welcome to CLI bank service. \n " +
                        "Enter operation number:\n " +
                        "1 - show accounts \n " +
                        "2 - create account \n " +
                        "3 - deposit \n " +
                        "4 - withdraw \n " +
                        "5- transfer \n " +
                        "6 - this message \n" +
                        " 7 - exit\n");
            } else if (input.equals("7")) {
                break;
            }
        }
    }


}
