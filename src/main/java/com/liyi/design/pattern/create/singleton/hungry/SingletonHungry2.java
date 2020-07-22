package com.liyi.design.pattern.create.singleton.hungry;

//若不适用 导致内存资源的浪费
//无法Lazy Loading
public class SingletonHungry2 {
    public static void main(String[] args) {
        SingletonHungry2 singletonHungry2 = SingletonHungry2.getInstatce();
        SingletonHungry2 singletonHungry21 = SingletonHungry2.getInstatce();
        System.out.println(singletonHungry2 == singletonHungry21);
    }
    //1.私有化构造器
    private SingletonHungry2(){

    }

    //2.生成静态变量(无final)
    private static SingletonHungry2 instatce;

    //3.静态方法块中执行
    static{
        instatce = new SingletonHungry2();
    }

    //4.对外暴露getInstance方法
    public static SingletonHungry2 getInstatce(){
        return instatce;
    }
}
