package com.liyi.design.pattern.behavior.memento;

public class MyObject {

    private int att;
    private int val;

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public MyMemento createMemtnto(int att, int val){
        return new MyMemento(att, val);
    }

    public void getFromMemento(MyMemento myMemento){
        this.att = myMemento.getAtt();
        this.val = myMemento.getVal();
    }
}
