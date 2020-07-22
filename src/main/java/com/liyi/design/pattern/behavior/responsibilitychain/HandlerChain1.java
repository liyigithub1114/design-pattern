package com.liyi.design.pattern.behavior.responsibilitychain;

public class HandlerChain1 extends MyHandler {

    public HandlerChain1(String name) {
        super(name);
    }

    @Override
    void intercept(MyResource myResource) {
        if(myResource.getPrice() < 5000){
            System.out.println("Handler1可以处理");
        }else{
            getMyHandler().intercept(myResource);
        }
    }
}
