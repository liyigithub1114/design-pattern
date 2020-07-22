package com.liyi.design.pattern.structure.decorator;

public class LongBlack extends Coffee {
    public LongBlack(){
        setDes("LongBlack Coffee");
        setPrice(15f);
    }

    @Override
    float cost() {
        return super.cost();
    }
}
