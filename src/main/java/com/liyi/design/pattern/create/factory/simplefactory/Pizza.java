package com.liyi.design.pattern.create.factory.simplefactory;

//Pizza拥有 准备、烹饪、切分、打包的操作
public abstract class Pizza {

    String type;

    void setType(String type){
        this.type = type;
    }

    //准备材料，每个Pizza材料不一样，留给子类写
    abstract void prepare();

    //烹饪方法一样
    void cook(){
        System.out.println(type + " Pizza 烹饪中");
    }

    //切分方法一样
    void cut(){
        System.out.println(type + " Pizza 切分中");
    }

    //d打包方法一样
    void box(){
        System.out.println(type + " Pizza 打包完成");
    }
}
