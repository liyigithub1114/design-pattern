package com.liyi.design.pattern.create.prototype.deepcopy.usercloneable;

//克隆的对象与 克隆对象中的成员都实现Cloneable，依次clone实现深拷贝
public class DeepCloneTarget implements Cloneable {

    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "DeepCloneTarget{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public DeepCloneTarget(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCloneTarget deepCloneTarget = (DeepCloneTarget) super.clone();
        return deepCloneTarget;
    }
}
