package com.liyi.design.pattern.create.singleton.full;

import java.util.HashSet;
import java.util.Set;

//可以Lazy Loading
//线程不安全 线程1 在 instatnce == null 时没有往下执行， 线程2创建， 然后线程1恢复，造成创建多个对象
public class SingletonFull1 {
    public static void main(String[] args) {
        SingletonFull1 singletonFull1 = SingletonFull1.getInstance();
        SingletonFull1 singletonFull11 = SingletonFull1.getInstance();
        System.out.println(singletonFull1 == singletonFull11);
    }

    //1.私有化构造器
    private SingletonFull1(){
    }

    //2.创建变量instance
    private static SingletonFull1 instance;

    //3.对外暴露
    public static SingletonFull1 getInstance(){
        if(instance == null){
            instance = new SingletonFull1();
        }
        return instance;
    }

}

class ThreadNotSafe{
    public static void main(String[] args) {
        //线程不安全
        Set<SingletonFull1> sets = new HashSet<>();

        for(int i=0;i<1000;i++){
            new Thread(() -> {
                SingletonFull1 instance = SingletonFull1.getInstance();
                sets.add(instance);
            }, i +"").start();
        }
        System.out.println(sets.size());
        for(SingletonFull1 instance : sets){
            System.out.println(instance);
        }
    }
}