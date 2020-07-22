package com.liyi.design.pattern.behavior.responsibilitychain;

public class HandlerChain2 extends MyHandler{

    public HandlerChain2(String name) {
        super(name);
    }

    @Override
    void intercept(MyResource myResource) {
        if(myResource.getPrice() < 10000){
            System.out.println("Handler2可以处理");
        }else{
            getMyHandler().intercept(myResource);
        }
    }
}
