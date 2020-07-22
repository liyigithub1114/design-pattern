package com.liyi.design.pattern.behavior.memento;

public class MyMemento {

    private int att;
    private int val;

    public MyMemento(int att, int val){
        this.att = att;
        this.val = val;
    }

    public int getAtt() {
        return att;
    }

    public int getVal() {
        return val;
    }
}
