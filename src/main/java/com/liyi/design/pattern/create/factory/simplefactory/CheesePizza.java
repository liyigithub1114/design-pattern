package com.liyi.design.pattern.create.factory.simplefactory;


public class CheesePizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("准备芝士Pizza材料");
    }

    @Override
    void setType(String type) {
        super.setType(type);
    }
}
