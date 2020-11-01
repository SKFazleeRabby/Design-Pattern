package com.mycompany.auctionhouse;


public class Bidder implements Observer{
    private double bidPrice;
    private String bidderPaddle;
    
    public Bidder(String paddleNumber, Auctioner auctionRoom){
        bidderPaddle = paddleNumber;
        System.out.println("Your Paddle Number is: " + bidderPaddle);
        auctionRoom.register(this);
    }

    @Override
    public void update(double bidPrice) {
        this.bidPrice = bidPrice;
        showBidPrice();
    }
    
    public void showBidPrice(){
        System.out.println("Current Bidding Price for "+ bidderPaddle +" is: " + this.bidPrice);
    }
    
}
