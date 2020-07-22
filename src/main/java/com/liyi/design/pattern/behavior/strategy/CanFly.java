package com.liyi.design.pattern.behavior.strategy;

public class CanFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("鸭子会飞");
    }
}
