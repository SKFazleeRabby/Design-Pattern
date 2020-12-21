package com.mycompany.mathematics;


public class ChainCalculator {

    public static void main(String[] args) {
        ChainHandler chainCalc1 = new AddNumbers();
        ChainHandler chainCalc2 = new SubNumbers();
        ChainHandler chainCalc3 = new MultiNumbers();
        ChainHandler chainCalc4 = new DivNumbers();
        
        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);
        
        Numbers request = new Numbers(4, 12, "pow");
        chainCalc1.calculate(request);
    }
    
}
