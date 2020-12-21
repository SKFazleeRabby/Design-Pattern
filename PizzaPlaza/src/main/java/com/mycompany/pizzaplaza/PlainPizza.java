package com.mycompany.pizzaplaza;


public class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Pizza Dough";
    }

    @Override
    public double getCost() {
        return 6;
    }

    
    
}
