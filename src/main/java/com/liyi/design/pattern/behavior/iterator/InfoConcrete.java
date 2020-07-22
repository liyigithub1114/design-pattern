package com.liyi.design.pattern.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoConcrete extends College{

    List<Department> departmentList;

    public InfoConcrete(){
        setName("小语种专业");
        departmentList = new ArrayList<>();
        departmentList.add(new Department("英语专业", "小语种学院"));
        departmentList.add(new Department("日语专业", "小语种学院"));
        departmentList.add(new Department("汉语专业", "小语种学院"));
    }

    public Iterator createIterator(){
        return new InfoCollegeIterator(departmentList);
    }
}
