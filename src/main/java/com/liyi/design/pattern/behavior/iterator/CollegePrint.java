package com.liyi.design.pattern.behavior.iterator;

import java.util.Iterator;
import java.util.List;

public class CollegePrint {

    public void print(List<College> collegeList){
        if(!collegeList.isEmpty()){
            for(College college : collegeList){
                System.out.println(college.getName() +" ------------- ");
                Iterator iterator = college.createIterator();
                while(iterator.hasNext()){
                    Department department = (Department) iterator.next();
                    System.out.println(department.toString());
                }
            }
        }
    }
}
