package com.mycompany.atmcardsystem;


public class BankAccount {
    private double cashInAccount;
    
    public BankAccount(double amountOfCash){
        cashInAccount = amountOfCash;
    }
    
    public void cashDeposit(double depositAmount){
        cashInAccount += depositAmount;
        System.out.println("The Amount of " + depositAmount + " BDT was Successfully Deposited");
    }
    
    public void cashWithdrawal(double withdrawalAmount){
        cashInAccount -= withdrawalAmount;
        System.out.println("The Amount of " + withdrawalAmount + " BDT was Successfully Withdrawn");
    }
    
    public boolean enoughMoney(double amount){
        if(amount > cashInAccount){
            return false;
        }
        return true;
    }
}
