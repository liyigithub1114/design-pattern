package com.liyi.design.pattern.create.factory.simplefactory;

import java.util.Scanner;

public class OrderPizza {
    SimpleFactory simpleFactory = null;
    //对修改关闭， 无论怎么新增，这里不用动，符合开闭原则
    public OrderPizza(SimpleFactory simpleFactory){
        this.simpleFactory = simpleFactory;
        Pizza pizza = null;
        String type = "";
        do{
            type = getType();
            pizza = simpleFactory.createPizza(type);

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

    //静态工厂的调用
    public OrderPizza(){
        Pizza pizza = null;
        String type = "";
        do{
            type = getType();
            pizza = SimpleFactory.createPizza1(type);

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
}

