package com.liyi.design.pattern.structure.decorator;

public class Chocolate extends MyDecorator{
    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3f);
    }
}
