package com.liyi.design.pattern.structure.adapter.interfaceadapter;

public class TestInterfaceAdapter {
    public static void main(String[] args) {
        MyInterfaceAdapter myInterfaceAdapter = new MyInterfaceAdapter() {
            @Override
            public void m1() {
                System.out.println("重写了m1");
            }
        };

        myInterfaceAdapter.m1();
    }
}
