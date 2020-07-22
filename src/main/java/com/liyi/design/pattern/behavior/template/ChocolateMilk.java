package com.liyi.design.pattern.behavior.template;

public class ChocolateMilk extends AbstractTemplate{
    @Override
    void add() {
        System.out.println("第二步， 添加巧克力");
    }

    @Override
    boolean judge() {
        return false;
    }
}
