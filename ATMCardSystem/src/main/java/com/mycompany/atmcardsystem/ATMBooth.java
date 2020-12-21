package com.mycompany.atmcardsystem;


public class ATMBooth {

    public static void main(String[] args) {
        BankAccountFacade account = new BankAccountFacade(9861256, 4369, 5000);
        account.withdrawMoney();
        
    }
    
}
