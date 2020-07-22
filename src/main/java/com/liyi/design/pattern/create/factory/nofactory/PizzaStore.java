package com.liyi.design.pattern.create.factory.nofactory;

public class PizzaStore {
    public static void main(String[] args) {
        //此方法不符合 开闭原则
        new OrderPizza();
    }
}
