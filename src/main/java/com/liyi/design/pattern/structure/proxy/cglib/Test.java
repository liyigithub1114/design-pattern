package com.liyi.design.pattern.structure.proxy.cglib;

public class Test {
    public static void main(String[] args) {
        Teach teach = new Teach();
        Teach teach1 = (Teach) new CglibProxy(teach).getInstance();
        teach1.teach();
    }
}
