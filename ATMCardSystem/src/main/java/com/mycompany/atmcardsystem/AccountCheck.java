package com.mycompany.atmcardsystem;


public class AccountCheck {
    private int accountNumber;
    private int pinNumber;
    
    public AccountCheck(int accountNumber, int pinNumber){
        this.accountNumber = accountNumber;
        this.pinNumber = pinNumber;
    }
    
    public int getAccountNumber(){
        return accountNumber;
    }
    
    public int getPinNumber(){
        return pinNumber;
    }
    
    public boolean checkAccountNumber(int clientAccountNumber){
        if(clientAccountNumber == accountNumber){
            return true;
        }
        return false;
    }
    
    public boolean checkPinNumber(int clientPinNumber){
        if(clientPinNumber == pinNumber){
            return true;
        }
        return false;
    }
}
