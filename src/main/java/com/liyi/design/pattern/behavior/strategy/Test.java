package com.liyi.design.pattern.behavior.strategy;

public class Test {
    public static void main(String[] args) {
        PekingDuck duck = new PekingDuck();
        duck.fly();
        duck.setFlyBehavior(new CanNotFly());
        duck.fly();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
    }
}
