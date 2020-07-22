package com.liyi.design.pattern.create.singleton.dcl;

//最常用，效率高，线程安全
public class SingletonDCL {
    public static void main(String[] args) {
    }

    //1.私有构造器
    private SingletonDCL(){

    }

    //2.私有变量
    private static volatile SingletonDCL instance;

    //3.对外暴露双检锁的getInstance
    public static SingletonDCL getInstance(){
        if(instance == null){
            synchronized (SingletonDCL.class){
                if(instance == null){
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }
}
