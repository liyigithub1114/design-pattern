package com.liyi.design.pattern.structure.proxy.dynamicproxy;

public class Test {
    public static void main(String[] args) {
        Teach teach = new Teach();
        ITeach teach1 = (ITeach) new DynamicProxy(teach).getObject();
        teach1.teach();
    }
}
