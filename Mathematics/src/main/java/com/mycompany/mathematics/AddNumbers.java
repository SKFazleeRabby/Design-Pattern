package com.mycompany.mathematics;


public class AddNumbers implements ChainHandler{
    private ChainHandler nextChain;

    @Override
    public void setNextChain(ChainHandler nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalucationMethod().equals("add")){
            System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = "
            + (request.getNumber1() + request.getNumber2()));
        }
        else{
            this.nextChain.calculate(request);
        }
    }
    
}
