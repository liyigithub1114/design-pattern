package com.liyi.design.pattern.behavior.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator{
    List<Department> departments;
    int index = -1;

    public InfoCollegeIterator(List<Department> departments){
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(index >= departments.size() - 1){
            return false;
        }else{
            index++;
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = null;
        if(index < departments.size()){
            department = departments.get(index);
        }
        return department;
    }
}
