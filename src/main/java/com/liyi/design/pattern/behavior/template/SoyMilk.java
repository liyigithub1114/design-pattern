package com.liyi.design.pattern.behavior.template;

public class SoyMilk extends AbstractTemplate{
    @Override
    void add() {
        System.out.println("第二步 : 添加豆子");
    }

    @Override
    boolean judge() {
        return false;
    }
}
