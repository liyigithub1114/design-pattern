package com.liyi.design.pattern.behavior.visitor;

public class Man extends Person {
    @Override
    void accept(Comment comment) {
        comment.getResultMan(this);
    }
}
