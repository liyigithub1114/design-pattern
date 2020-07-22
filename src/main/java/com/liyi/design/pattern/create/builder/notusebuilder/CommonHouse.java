package com.liyi.design.pattern.create.builder.notusebuilder;

//这样的创建模式，在继承类与中间类没有缓冲层，耦合度高
public class CommonHouse extends AbstarctHouse {
    @Override
    void builderBase() {
        System.out.println("普通房子打地基");
    }

    @Override
    void builderWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    void roofed() {
        System.out.println("普通房子封顶");
    }
}
