package com.liyi.design.pattern.structure.bridge;

public class Vivo extends Brand {


    @Override
    void close() {
        System.out.println("Vivo关机");
    }

    @Override
    void open() {
        System.out.println("Vivo开机");
    }
}
