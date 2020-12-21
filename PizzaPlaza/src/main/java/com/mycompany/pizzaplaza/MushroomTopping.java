package com.mycompany.pizzaplaza;


public class MushroomTopping extends ToppingDecorator{
    public MushroomTopping(Pizza basicPizza){
        super(basicPizza);
        System.out.println("Adding Mushroom Toppings");
    }
    
    public String getDescription(){
        return basicPizza.getDescription() + " with Mushroom toppings";
    }
    
    public double getCost(){
        return basicPizza.getCost() + 0.8;
    }
}
