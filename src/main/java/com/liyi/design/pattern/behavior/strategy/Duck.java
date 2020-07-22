package com.liyi.design.pattern.behavior.strategy;

public abstract class Duck {

    FlyBehavior flyBehavior;

    public Duck(){
    }

    void fly(){
        if(flyBehavior != null){
            flyBehavior.fly();
        }
    }
}
