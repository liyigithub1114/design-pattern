package com.liyi.design.pattern.structure.decorator;

public class Test {
    public static void main(String[] args) {
        LongBlack longBlack = new LongBlack();

        Milk milk = new Milk(longBlack);
        System.out.println(milk.getDes() + " " + milk.getPrice());

        Chocolate chocolate = new Chocolate(milk);
        System.out.println(chocolate.getDes() + " " + chocolate.getPrice());

        Soy soy = new Soy(chocolate);
        System.out.println(soy.getDes() + " " + soy.getPrice());
    }
}
