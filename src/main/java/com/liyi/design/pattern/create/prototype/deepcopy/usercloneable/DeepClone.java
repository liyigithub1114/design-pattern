package com.liyi.design.pattern.create.prototype.deepcopy.usercloneable;

public class DeepClone implements Cloneable{

    private String name;
    private String email;
    private int age;

    private DeepCloneTarget deepCloneTarget;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DeepClone(String name, String email, int age, DeepCloneTarget deepCloneTarget) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.deepCloneTarget = deepCloneTarget;
    }

    public DeepCloneTarget getDeepCloneTarget() {
        return deepCloneTarget;
    }

    public void setDeepCloneTarget(DeepCloneTarget deepCloneTarget) {
        this.deepCloneTarget = deepCloneTarget;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepClone deepClone = (DeepClone) super.clone();
        deepClone.deepCloneTarget = (DeepCloneTarget) deepClone.deepCloneTarget.clone();
        return deepClone;
    }
}
