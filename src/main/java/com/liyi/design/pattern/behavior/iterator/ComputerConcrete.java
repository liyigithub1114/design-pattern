package com.liyi.design.pattern.behavior.iterator;

import java.util.Iterator;

public class ComputerConcrete extends College {

    Department[] departments;

    public ComputerConcrete(){
        setName("计算机学院");
        departments = new Department[5];
        departments[0] = new Department("软件工程专业", "计算机学院");
        departments[1]  = new Department("信息工程专业", "计算机学院");
        departments[2]  = new Department("通信工程专业", "计算机学院");
    }

    public Iterator createIterator(){
        return new ComputerCollegeIterator(departments);
    }
}
