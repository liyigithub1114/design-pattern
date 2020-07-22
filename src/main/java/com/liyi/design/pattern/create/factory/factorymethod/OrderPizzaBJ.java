package com.liyi.design.pattern.create.factory.factorymethod;

public class OrderPizzaBJ extends OrderPizza {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if("Greek".equalsIgnoreCase(type)){
            pizza = new BJGreekPizza();
        }else if("Cheese".equalsIgnoreCase(type)){
            pizza = new BJCheesePizza();
        }else{

        }
        return pizza;
    }
}
