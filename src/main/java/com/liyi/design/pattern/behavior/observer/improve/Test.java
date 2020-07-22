package com.liyi.design.pattern.behavior.observer.improve;

public class Test {
    public static void main(String[] args) {
        Observer observer = new CurrentConditions();
        Observer observer1 = new MyObserver();
        WetherData wetherData = new WetherData();
        wetherData.registryObserver(observer);
        wetherData.registryObserver(observer1);
        wetherData.update(11,2,4);
    }
}
