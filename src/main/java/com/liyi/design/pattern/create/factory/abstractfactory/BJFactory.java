package com.liyi.design.pattern.create.factory.abstractfactory;

public class BJFactory extends AbstarctFactory {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("greek")){
            pizza = new BJGreekPizza();
        }else if(type.equalsIgnoreCase("cheese")){
            pizza = new BJCheesePizza();
        }else {
            pizza = null;
        }
        return pizza;
    }
}
