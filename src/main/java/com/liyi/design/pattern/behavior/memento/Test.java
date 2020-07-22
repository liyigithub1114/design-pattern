package com.liyi.design.pattern.behavior.memento;

public class Test {

    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        MyMemento memtnto = myObject.createMemtnto(10, 5);
        Caretaker caretaker = new Caretaker(memtnto);

        myObject.setAtt(0);
        myObject.setVal(0);

        myObject.getFromMemento(caretaker.getMyMemento());

        System.out.println(myObject.getAtt() + " " + myObject.getVal());
    }
}
