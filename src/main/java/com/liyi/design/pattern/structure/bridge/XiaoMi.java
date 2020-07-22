package com.liyi.design.pattern.structure.bridge;

public class XiaoMi extends Brand {

    @Override
    void close() {
        System.out.println("XiaoMi关机");
    }

    @Override
    void open() {
        System.out.println("XiaoMi开机");
    }
}
