package com.liyi.design.pattern.create.factory.abstractfactory;

public class LDCheesePizza extends Pizza {
    @Override
    void prepare() {
        setType("伦敦Cheese Pizza");
        System.out.println("伦敦 Cheese Pizza 材料准备");
    }
}
