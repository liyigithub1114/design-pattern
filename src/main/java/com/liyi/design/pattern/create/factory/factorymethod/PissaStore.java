package com.liyi.design.pattern.create.factory.factorymethod;

import java.util.Scanner;

public class PissaStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String area = scanner.next();
        if(area.equalsIgnoreCase("BJ")){
            new OrderPizzaBJ();
        }else{
            new OrderPizzaLD();
        }
    }
}
