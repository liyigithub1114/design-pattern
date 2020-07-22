package com.liyi.design.pattern.create.factory.simplefactory;

public class OrderStore {
    public static void main(String[] args) {
        //简单工厂的调用
        //new OrderPizza(new SimpleFactory());

        //静态工厂的调用
        new OrderPizza();
    }
}
