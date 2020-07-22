package com.liyi.design.pattern.structure.decorator;

public class Soy extends MyDecorator {
    public Soy(Drink drink) {
        super(drink);
        setDes("酸奶");
        setPrice(5f);
    }
}
