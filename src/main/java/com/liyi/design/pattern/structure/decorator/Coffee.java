package com.liyi.design.pattern.structure.decorator;

public abstract class Coffee extends Drink{

    @Override
    float cost() {
        return super.getPrice();
    }
}
