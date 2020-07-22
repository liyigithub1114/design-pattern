package com.liyi.design.pattern.create.factory.abstractfactory;

public abstract class Pizza {

    abstract void prepare();

    String type;

    public void setType(String type) {
        this.type = type;
    }

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
