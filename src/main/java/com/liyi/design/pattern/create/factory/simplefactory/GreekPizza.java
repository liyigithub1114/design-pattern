package com.liyi.design.pattern.create.factory.simplefactory;


public class GreekPizza extends Pizza{


    @Override
    void prepare() {
        System.out.println("准备希腊披萨材料");
    }

    @Override
    void setType(String type) {
        super.setType(type);
    }
}
