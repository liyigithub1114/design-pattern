package com.liyi.design.pattern.behavior.memento;

import java.util.HashMap;
import java.util.List;

public class Caretaker {

    //保存一次状态
    private MyMemento myMemento;
    //保存多次状态
    private List<MyMemento> myMementos;
    //保存多个角色的多个状态
    private HashMap<String, MyMemento> myMementoHashMap;

    public Caretaker(MyMemento myMemento){
        this.myMemento = myMemento;
    }

    public MyMemento getMyMemento() {
        return myMemento;
    }
}
