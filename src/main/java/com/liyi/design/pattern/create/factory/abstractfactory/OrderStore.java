package com.liyi.design.pattern.create.factory.abstractfactory;

import java.util.Calendar;

public class OrderStore {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        new OrderPizza(new LDFactory());
    }
}
