package com.liyi.design.pattern.create.singleton.enumsingleton;

//推荐使用
enum SingletonEnum {
    INSTANCE
}

class TestEnum{
    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;
        System.out.println(instance == instance2);
    }
}