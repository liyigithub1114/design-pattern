package com.liyi.design.pattern.create.prototype.deepcopy.userserialize;

import java.io.Serializable;

//序列化的克隆不需要实现Cloneable
public class DeepCloneTarget implements Serializable {
    private String name;

    private int age;

    public DeepCloneTarget(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "DeepCloneTarget{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
