package com.liyi.design.pattern.create.singleton.staticinternalclass;

//推荐使用，在加载类SingletonStatic 时不会加载内部类， 保证lazy loading
//在去获取MySingleton时，JVM加载类时是线程安全的
public class SingletonStatic {
    public static void main(String[] args) {

    }

    //1.私有构造器
    private SingletonStatic(){

    }

    //2.静态内部类
    private static class MySingleton{
        private final static SingletonStatic instance = new SingletonStatic();
    }

    //3.对外暴露的方法(synchronized)
    public static synchronized SingletonStatic getInstance(){
        return MySingleton.instance;
    }
}
