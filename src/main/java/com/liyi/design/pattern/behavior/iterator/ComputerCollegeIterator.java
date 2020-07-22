package com.liyi.design.pattern.behavior.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator{

    Department[] departments ;
    int index = 0;

    public ComputerCollegeIterator(Department[] departments){
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(index >= departments.length || departments[index] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = null;
        if(index < departments.length && departments[index] != null){
            department = departments[index];
            index++;
        }
        return department;
    }
}
