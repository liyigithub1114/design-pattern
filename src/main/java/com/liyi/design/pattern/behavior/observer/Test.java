package com.liyi.design.pattern.behavior.observer;

public class Test {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WetherData wetherData = new WetherData(currentConditions);
        wetherData.update(11,2,3);
    }
}
