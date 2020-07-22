package com.liyi.design.pattern.structure.bridge;

public class TestBridge {
    public static void main(String[] args) {
        new FoldedPhone(new XiaoMi()).close();
    }
}
