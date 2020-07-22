package com.liyi.design.pattern.structure.proxy.staticproxy;

public class Test {
    public static void main(String[] args) {
        TeachProxy teachProxy = new TeachProxy(new Teach());
        teachProxy.teach();
    }
}
