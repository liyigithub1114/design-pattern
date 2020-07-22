package com.liyi.design.pattern.behavior.strategy;

public class ToyDuck extends Duck{


    public ToyDuck() {
        System.out.println("玩具鸭");
        flyBehavior = new CanNotFly();
    }
}
