package com.mycompany.stockapp;
import java.util.ArrayList;


public class StockServer implements Subject {
    
    private ArrayList<Observer> observers;
    private double imbPrice;
    private double applePrice;
    private double googlePrice;
    
    
    public StockServer(){
        observers = new ArrayList<Observer>();
    }
    
    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int index = observers.indexOf(o);
        observers.remove(index);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update(imbPrice, applePrice, googlePrice);
        }
    }
    
    public void setIMBPrice(double IBMPrice){
        this.imbPrice = IBMPrice;
        notifyObserver();
    }
    
    public void setApplePrice(double ApplePrice){
        this.applePrice = ApplePrice;
        notifyObserver();
    }
    
    public void setGooglePrice(double GooglePrice){
        this.googlePrice = GooglePrice;
        notifyObserver();
    }
    
}
