package com.liyi.design.pattern.create.factory.factorymethod;

import java.util.Scanner;

public abstract class OrderPizza {

    abstract Pizza createPizza(String type);

    public OrderPizza(){
        Pizza pizza = null;
        do{
            String type = getType();
            pizza = createPizza(type);

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
