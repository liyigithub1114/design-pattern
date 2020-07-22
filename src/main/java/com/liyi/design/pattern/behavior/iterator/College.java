package com.liyi.design.pattern.behavior.iterator;

import java.util.Iterator;

public abstract class College {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract Iterator createIterator();
}
