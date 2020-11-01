package com.mycompany.auctionhouse;


public interface Subject {
    
    public void register(Observer newObserver);
    public void unregister(Observer currentObserver);
    public void notifyObserver();
    
}
