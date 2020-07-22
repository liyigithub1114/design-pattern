package com.liyi.design.pattern.create.prototype.deepcopy.userserialize;

import java.io.*;

//序列化的方式不需要实现Cloneable
public class DeepClone implements Serializable {

    private String name;
    private int age;

    private DeepCloneTarget deepCloneTarget;

    public DeepClone(String name, int age, DeepCloneTarget deepCloneTarget) {
        this.name = name;
        this.age = age;
        this.deepCloneTarget = deepCloneTarget;
    }

    @Override
    public String toString() {
        return "DeepClone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", deepCloneTarget=" + deepCloneTarget +
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

    public DeepCloneTarget getDeepCloneTarget() {
        return deepCloneTarget;
    }

    public void setDeepCloneTarget(DeepCloneTarget deepCloneTarget) {
        this.deepCloneTarget = deepCloneTarget;
    }

    //推荐使用的方式
    public DeepClone myClone(){
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try{
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepClone deepClone = (DeepClone) ois.readObject();

            return deepClone;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally {
           try{
                ois.close();
                bis.close();
                oos.close();
                bos.close();
           }catch (Exception e){
               e.printStackTrace();
           }
        }
    }
}
