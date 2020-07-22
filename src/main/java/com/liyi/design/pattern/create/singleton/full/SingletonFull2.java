package com.liyi.design.pattern.create.singleton.full;

import java.util.HashSet;
import java.util.Set;

//虽然线程安全，但是同步锁开销太大
public class SingletonFull2 {
    public static void main(String[] args) {

    }

    //1.私有化构造器
    private SingletonFull2(){

    }

    //2.创建变量
    private static SingletonFull2 instance;

    //3.线程安全的对外方法
    public static synchronized SingletonFull2 getInstance(){
        if(instance == null){
            instance = new SingletonFull2();
        }
        return instance;
    }
}

class ThreadSafe{
    public static void main(String[] args) {
        Set<SingletonFull2> sets = new HashSet<>();

        for(int i=0;i<1000;i++){
            new Thread(() -> {
                SingletonFull2 instance = SingletonFull2.getInstance();
                sets.add(instance);
            }, i +"").start();
        }
        System.out.println(sets.size());
        for(SingletonFull2 instance : sets){
            System.out.println(instance);
        }
    }
}