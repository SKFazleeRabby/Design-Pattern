package com.mycompany.atmcardsystem;

import java.util.Scanner;


public class BankAccountFacade {
    private int accountNumber;
    private int pinNumber;
    StartMachine machine;
    AccountCheck checker;
    BankAccount account;
    
    public BankAccountFacade(int clientAccountNumer, int clientPinNumber, double cashInAccount){
        accountNumber = clientAccountNumer;
        pinNumber = clientPinNumber;
        machine = new StartMachine();
        checker = new AccountCheck(9861256, 4369);
        account = new BankAccount(cashInAccount);
        machine.showWelcomeMessage();
    }
    
    public void withdrawMoney(){
        Scanner input = new Scanner(System.in);
        int amount;
        
        if(checker.checkAccountNumber(9861256) && checker.checkPinNumber(4369)){
            System.out.println("Enter the Amount to Withdraw: ");
            amount = input.nextInt();
            if(account.enoughMoney(amount)){
                account.cashWithdrawal(amount);
            }
            else{
                System.out.println("Not Enought Money to Withdraw");
            }
        }
        else{
            System.out.println("Wrong Account Number or Pin Number");
        }
    }
    
    
}
