package com.liyi.design.pattern.behavior.strategy;

public class CanNotFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("鸭子不会飞");
    }
}
