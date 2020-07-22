package com.liyi.design.pattern.create.builder.notusebuilder;

public abstract class AbstarctHouse {

    //打地基
    abstract void builderBase();

    //砌墙
    abstract void builderWalls();

    //封顶
    abstract void roofed();

    public void getResult(){
        builderBase();
        builderWalls();
        roofed();
    }
}
