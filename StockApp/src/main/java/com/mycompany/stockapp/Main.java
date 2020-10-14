package com.mycompany.stockapp;


public class Main {

    public static void main(String[] args) {
        StockServer server_1 = new StockServer();
        StockApp app_1 = new StockApp("Rabby", server_1);
        StockApp app_2 = new StockApp("Habib", server_1);
        
        server_1.setIMBPrice(200);
        server_1.setGooglePrice(500);
        
    }
    
}
