package com.liyi.design.pattern.create.prototype.simplecopy;


public class TestMyPrototype {
    //克隆10个MyPrototype实例
    public static void main(String[] args) {
        MyPrototype myPrototype = new MyPrototype("张三",13 + "","男",new MyPrototype("李四",13 + "", "男",null));

        for(int i = 0; i< 5; i++){
            try {
                MyPrototype myPrototype1 = (MyPrototype)myPrototype.clone();
                System.out.println("对象 hashCode = " + myPrototype.hashCode() +"    " + "对象 中的对象的hashCode = " + myPrototype.getMyPrototype().hashCode());
                System.out.println("克隆的对象 hashCode = " + myPrototype1.hashCode() +"    " + "克隆的对象 中的对象的hashCode = " + myPrototype1.getMyPrototype().hashCode());
                System.out.println();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }
}
