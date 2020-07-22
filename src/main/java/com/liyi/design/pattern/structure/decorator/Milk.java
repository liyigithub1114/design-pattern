package com.liyi.design.pattern.structure.decorator;

public class Milk extends MyDecorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(1);
    }
}
