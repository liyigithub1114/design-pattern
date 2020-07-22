package com.liyi.design.pattern.create.factory.abstractfactory;

public class LDGreekPizza extends Pizza {
    @Override
    void prepare() {
        setType("伦敦Greek Pizza");
        System.out.println("伦敦 Greek Pizza 材料准备");
    }
}
