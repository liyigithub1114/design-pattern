package com.liyi.design.pattern.structure.component;

public abstract class MyComponent {

    String des;

    String name;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyComponent(String des, String name) {
        this.des = des;
        this.name = name;
    }

    abstract void add(MyComponent myComponent);

    abstract boolean remove(MyComponent myComponent);

    abstract void print();
}
