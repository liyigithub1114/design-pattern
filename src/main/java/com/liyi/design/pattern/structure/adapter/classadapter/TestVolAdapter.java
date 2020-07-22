package com.liyi.design.pattern.structure.adapter.classadapter;

public class TestVolAdapter {
    public static void main(String[] args) {
        Phone phone = new Phone(new VoltageAdapter());
        phone.charging();
    }
}
