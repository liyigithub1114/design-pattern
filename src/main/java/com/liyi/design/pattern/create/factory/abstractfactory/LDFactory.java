package com.liyi.design.pattern.create.factory.abstractfactory;

public class LDFactory extends AbstarctFactory {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("greek")){
            pizza = new LDGreekPizza();
        }else if(type.equalsIgnoreCase("cheese")){
            pizza = new LDCheesePizza();
        }else {
            pizza = null;
        }
        return pizza;
    }
}
