package com.liyi.design.pattern.behavior.visitor;

public class Woman extends Person {

    @Override
    void accept(Comment comment) {
        comment.getResultWoman(this);
    }
}
