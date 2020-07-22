package com.liyi.design.pattern.create.prototype.simplecopy;

//此类将被自己复制
//默认克隆模式是浅拷贝， MyPrototype中的对象 myPrototype 没有被重新生成
public class MyPrototype implements Cloneable {

    private String name;
    private String age;
    private String gender;
    private MyPrototype myPrototype;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public MyPrototype getMyPrototype() {
        return myPrototype;
    }

    public void setMyPrototype(MyPrototype myPrototype) {
        this.myPrototype = myPrototype;
    }

    public MyPrototype(String name, String age, String gender, MyPrototype myPrototype) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.myPrototype = myPrototype;
    }

    @Override
    public String toString() {
        return "MyPrototype{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", myPrototype=" + myPrototype +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        MyPrototype myPrototype = null;
        try{
            myPrototype = (MyPrototype)super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return myPrototype;
    }
}
