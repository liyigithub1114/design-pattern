package com.liyi.design.pattern.create.factory.factorymethod;

public class OrderPizzaLD extends OrderPizza {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if("Greek".equalsIgnoreCase(type)){
            pizza = new LDGreekPizza();
        }else if("Cheese".equalsIgnoreCase(type)){
            pizza = new LDCheesePizza();
        }else{

        }
        return pizza;
    }
}
