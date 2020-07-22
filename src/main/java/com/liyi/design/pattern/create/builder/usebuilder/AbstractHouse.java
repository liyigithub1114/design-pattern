package com.liyi.design.pattern.create.builder.usebuilder;

//
public abstract class AbstractHouse {


    ProductTools productTools = new ProductTools();

    abstract String buildBase();

    abstract String buildWalls();

    abstract String roofed();

    abstract String end();

    //构建房子的步骤交由 指挥者指挥
    public ProductTools getResult(){
        return productTools;
    }

}
