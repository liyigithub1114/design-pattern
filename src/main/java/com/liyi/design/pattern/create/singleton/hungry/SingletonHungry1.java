package com.liyi.design.pattern.create.singleton.hungry;

//问题，该类在加载的时候会创建对象，若系统不使用，则会造成内存的浪费
public class SingletonHungry1 {
    public static void main(String[] args) {
        SingletonHungry1 singletonHungry1 = getInstance();
        SingletonHungry1 singletonHungry11 = getInstance();

        System.out.println(singletonHungry1 == singletonHungry11);
    }

    //1.私有化构造器， 使其他类不能new
    private SingletonHungry1(){

    }

    //2.直接new出对象，在类加载时完成创建(final关键字表示不可更改)
    private final static SingletonHungry1 singletonHungry1 = new SingletonHungry1();

    //3.对外暴露一个getInstatnce方法
    public static SingletonHungry1 getInstance(){
        return singletonHungry1;
    }
}