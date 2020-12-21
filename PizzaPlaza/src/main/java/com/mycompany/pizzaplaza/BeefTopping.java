package com.mycompany.pizzaplaza;


public class BeefTopping extends ToppingDecorator{
    
    public BeefTopping(Pizza basicPizza){
        super(basicPizza);
        System.out.println("Adding Beef Toppings");
    }
    
    public String getDescription(){
        return basicPizza.getDescription() + " with Beef toppings";
    }
    
    public double getCost(){
        return basicPizza.getCost() + 2;
    }
    
}
