package com.liyi.design.pattern.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

//使用一种数据结构将所需要访问的对象都封装起来
public class ObjectStructure {

    List<Person> persons;

    public ObjectStructure(){
        persons = new ArrayList<>();
    }

    public void add(Person person){
        persons.add(person);
    }

    public boolean remove(Person person){
        return persons.remove(person);
    }

    public void display(Comment comment){
        if(!persons.isEmpty()){
            for(Person person : persons){
                person.accept(comment);
            }
        }
    }
}
