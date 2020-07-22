package com.liyi.design.pattern.create.factory.abstractfactory;

import java.util.Scanner;

public class OrderPizza {

    AbstarctFactory abstarctFactory;

    public OrderPizza(AbstarctFactory abstarctFactory){
        this.abstarctFactory = abstarctFactory;
        Pizza pizza = null;
        do{
            String type = getType();
            pizza = abstarctFactory.createPizza(type);

            if(pizza != null){
                pizza.prepare();
                pizza.cook();
                pizza.cut();
                pizza.box();
            }else{
                break;
            }
        }while(true);
    }
    private String getType(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        return str;
    }
}
