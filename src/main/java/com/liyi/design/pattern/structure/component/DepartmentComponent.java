package com.liyi.design.pattern.structure.component;

public class DepartmentComponent extends MyComponent {


    public DepartmentComponent(String des, String name) {
        super(des, name);
        setDes(des);
        setName(name);
    }

    @Override
    void add(MyComponent myComponent) {

    }

    @Override
    boolean remove(MyComponent myComponent) {
        return false;
    }

    @Override
    void print() {
        System.out.println(getName() +"--------" + getDes());
    }
}
