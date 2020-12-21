package com.mycompany.mathematics;


public class Numbers {
    private int number1;
    private int number2;
    
    private String calucationMethod;
    
    public Numbers(int newNumber1, int newNumber2, String newCalculationMethod){
        number1 = newNumber1;
        number2 = newNumber2;
        calucationMethod = newCalculationMethod;
    }
    
    public int getNumber1(){
        return number1;
    }
    
    public int getNumber2(){
        return number2;
    }
    
    public String getCalucationMethod(){
        return calucationMethod;
    }
}
