package com.mycompany.auctionhouse;


public class AuctionHouseManager {

    public static void main(String[] args) {
        Auctioner room1 = new Auctioner("Painting");
   
        Bidder user1 = new Bidder("13", room1);
        Bidder user2 = new Bidder("101", room1);
        Bidder user3 = new Bidder("77", room1);
        
        room1.setBidPrice(50);
        room1.setBidPrice(100);
        
    }
    
}
