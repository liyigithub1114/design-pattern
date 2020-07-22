package com.liyi.design.pattern.behavior.responsibilitychain;

public class HandlerChain3 extends MyHandler{

    public HandlerChain3(String name) {
        super(name);
    }

    @Override
    void intercept(MyResource myResource) {
        if(myResource.getPrice() < 20000){
            System.out.println("Handler3可以处理");
        }else{
            System.out.println("没有人可以处理");
        }
    }
}
