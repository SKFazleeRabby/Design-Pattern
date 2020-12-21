package com.mycompany.pizzaplaza;


public class PizzaPlaza {

    public static void main(String[] args) {
        Pizza pizza_1 = new MushroomTopping(new BeefTopping(new PlainPizza()));
        System.out.println(pizza_1.getDescription());
        System.out.println(pizza_1.getCost());        
    }
    
}


// beef, chicken, sausage, macaroni, pepperoni, beacon, shripm, mushroom, vegetables, tomato sauce, white sauce,
// bbq sauce.
