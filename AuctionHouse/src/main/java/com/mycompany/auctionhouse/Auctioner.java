package com.mycompany.auctionhouse;

import java.util.ArrayList;


public class Auctioner implements Subject{
    
    private ArrayList<Observer> bidders;
    private double bidPrice;
    private String bidItem;
    
    public Auctioner(String newBidItem){
        bidders = new ArrayList<Observer>();
        bidItem = newBidItem;
    }

    @Override
    public void register(Observer newObserver) {
        bidders.add(newObserver);
    }

    @Override
    public void unregister(Observer currentObserver) {
        int index = bidders.indexOf(currentObserver);
        bidders.remove(index);
    }

    @Override
    public void notifyObserver() {
        for(Observer bidder: bidders){
            bidder.update(bidPrice);
        }
    }
    
    public void setBidPrice(double newBidPrice){
        bidPrice = newBidPrice;
        notifyObserver();
    }
    
}
