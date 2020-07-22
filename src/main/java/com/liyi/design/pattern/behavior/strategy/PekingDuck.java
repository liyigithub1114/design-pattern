package com.liyi.design.pattern.behavior.strategy;

public class PekingDuck extends Duck{

    public PekingDuck(){
        System.out.println("北京鸭");
        flyBehavior = new CanFly();
    }

    //策略模式，通过不同的策略处理
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
