package com.liyi.design.pattern.structure.proxy.staticproxy;

public class Teach implements ITeach {
    @Override
    public void teach() {
        System.out.println("这是Teach的 teach() 方法");
    }
}
