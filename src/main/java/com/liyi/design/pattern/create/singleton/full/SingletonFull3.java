package com.liyi.design.pattern.create.singleton.full;

import java.util.HashSet;
import java.util.Set;

//这种方法甚至线程同步都不行
public class SingletonFull3 {
    //1.私有化构造器
    private SingletonFull3(){

    }

    //2.创建变量
    private static SingletonFull3 instance;

    //3.线程安全的对外方法
    public static synchronized SingletonFull3 getInstance(){
        if(instance == null){
            synchronized (SingletonFull3.class){
                instance = new SingletonFull3();
            }
        }
        return instance;
    }
}

class ThreadNotSafeAlso{
    public static void main(String[] args) {
        Set<SingletonFull3> sets = new HashSet<>();

        for(int i=0;i<1000;i++){
            new Thread(() -> {
                SingletonFull3 instance = SingletonFull3.getInstance();
                sets.add(instance);
            }, i +"").start();
        }
        System.out.println(sets.size());
        for(SingletonFull3 instance : sets){
            System.out.println(instance);
        }
    }
}
