package com.liyi.design.pattern.structure.component;

import java.util.ArrayList;
import java.util.List;

public class UniversityComponent extends MyComponent{

    //组合 大学下面有具体的学校
    List<MyComponent> res = new ArrayList<>();

    public UniversityComponent(String des, String name) {
        super(des, name);
        setDes(des);
        setName(name);
    }

    @Override
    void add(MyComponent myComponent) {
        res.add(myComponent);
    }

    @Override
    boolean remove(MyComponent myComponent) {
        return res.remove(myComponent);
    }

    @Override
    void print() {
        System.out.println("-------------" + getName()+"-----------" + getDes());
        if(res != null){
            for(MyComponent myComponent: res){
                myComponent.print();
            }
        }
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void setDes(String des) {
        super.setDes(des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
