package com.liyi.design.pattern.behavior.responsibilitychain;

public class Test {
    public static void main(String[] args) {
        MyResource myResource = new MyResource(150000);
        HandlerChain1 chain1 = new HandlerChain1("handler1");
        HandlerChain2 chain2 = new HandlerChain2("handler2");
        HandlerChain3 chain3 = new HandlerChain3("handler3");

        chain1.setMyHandler(chain2);
        chain2.setMyHandler(chain3);

        chain1.intercept(myResource);
    }
}
