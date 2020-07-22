package com.liyi.design.pattern.behavior.visitor;

public class Fail extends Comment{
    @Override
    void getResultMan(Person person) {
        System.out.println("给男人的评价很失败");
    }

    @Override
    void getResultWoman(Person person) {
        System.out.println("给女人的评价很失败");
    }
}
