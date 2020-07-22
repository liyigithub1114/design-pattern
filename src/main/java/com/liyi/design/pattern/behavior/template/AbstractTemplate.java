package com.liyi.design.pattern.behavior.template;

public abstract class AbstractTemplate {

    final void make(){
        source();
        //钩子方法
        if(judge()){
            add();
        }
        water();
    }

    final void source(){
        System.out.println("第一步 : 准备材料");
    }

    //添加配料，这是不同的，留给子类实现
    abstract void add();

    final void water(){
        System.out.println("第三步 ：加水打碎");
    }

    abstract boolean judge();
}
