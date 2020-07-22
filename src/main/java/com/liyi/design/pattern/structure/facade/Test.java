package com.liyi.design.pattern.structure.facade;

public class Test {
    public static void main(String[] args) {
        MyFacade facade = new MyFacade();
        facade.open();
        facade.close();
    }
}
