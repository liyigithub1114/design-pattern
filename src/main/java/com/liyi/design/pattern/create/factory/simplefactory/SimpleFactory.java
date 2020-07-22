package com.liyi.design.pattern.create.factory.simplefactory;



public class SimpleFactory {

    //根据其子类 完成创建 (对扩展开放)
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equalsIgnoreCase("Greek")) {
            pizza = new GreekPizza();
            pizza.setType("Greek");
        } else if (type.equalsIgnoreCase("Cheese")) {
            pizza = new CheesePizza();
            pizza.setType("Cheese");
        }else{
            return null;
        }
        return pizza;
    }

    //静态工厂
    public static Pizza createPizza1(String type){
        Pizza pizza = null;
        if (type.equalsIgnoreCase("Greek")) {
            pizza = new GreekPizza();
            pizza.setType("Greek");
        } else if (type.equalsIgnoreCase("Cheese")) {
            pizza = new CheesePizza();
            pizza.setType("Cheese");
        }
        return pizza;
    }
}
