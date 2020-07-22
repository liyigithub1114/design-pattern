package com.liyi.design.pattern.create.factory.nofactory;

import java.util.Scanner;

//订购Pizza类
public class OrderPizza {

    public OrderPizza(){
        Pizza pizza = null;
        do{
            String type = getType();
            if(type.equalsIgnoreCase("Greek")){
                pizza = new GreekPizza();
                pizza.setType("Greek");
            }else if(type.equalsIgnoreCase("Cheese")){
                pizza = new CheesePizza();
                pizza.setType("Cheese");
            }else{
                break;
            }

            if(pizza != null){
                pizza.prepare();
                pizza.cook();
                pizza.cut();
                pizza.box();
            }

        }while(true);
    }

    public String getType(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        return str;
    }
}
