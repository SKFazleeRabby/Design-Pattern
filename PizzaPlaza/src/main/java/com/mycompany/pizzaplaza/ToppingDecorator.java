package com.mycompany.pizzaplaza;


abstract class ToppingDecorator implements Pizza{
    protected Pizza basicPizza;
    
    public ToppingDecorator(Pizza basicPizza){
        this.basicPizza = basicPizza;
    }
    
    public String getDescription(){
        return basicPizza.getDescription();
    }
    
    public double getCost(){
        return basicPizza.getCost();
    }
    
}
