package com.liyi.design.pattern.structure.adapter.objectadapter;

public class TestVolAdapter {
    public static void main(String[] args) {
        Phone phone = new Phone(new VoltageAdapter(new Voltage220V()));
        phone.charging();
    }
}
