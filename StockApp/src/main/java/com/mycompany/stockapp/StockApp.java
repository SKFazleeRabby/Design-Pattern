package com.mycompany.stockapp;


public class StockApp implements Observer {
    
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;
    private String clientName;
    private Subject stockServer;
    
    public StockApp(String client, StockServer serverName){
        this.stockServer = serverName;
        this.clientName = client;
        System.out.println("New Client: " + this.clientName);
        this.stockServer.register(this);
    }
    

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;
        printPrice();
    }
    
    public void printPrice(){
        System.out.println("");
        System.out.println(this.clientName);
        System.out.println("The Price of IBM Stock is: " + this.ibmPrice);
        System.out.println("The Price of Apple Stock is: " + this.applePrice);
        System.out.println("The Price of Google Stock is: " + this.googlePrice);
    }
    
}
