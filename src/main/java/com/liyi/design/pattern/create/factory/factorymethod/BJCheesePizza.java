package com.liyi.design.pattern.create.factory.factorymethod;

public class BJCheesePizza extends Pizza {
    @Override
    void prepare() {
        setType("北京Cheese Pizza");
        System.out.println("北京 Cheese Pizza 材料准备");
    }
}
