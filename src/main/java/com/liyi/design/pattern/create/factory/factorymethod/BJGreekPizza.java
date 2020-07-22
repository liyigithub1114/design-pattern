package com.liyi.design.pattern.create.factory.factorymethod;

public class BJGreekPizza extends Pizza {
    @Override
    void prepare() {
        setType("北京Greek Pizza");
        System.out.println("北京 Greek Pizza 材料准备");
    }
}
