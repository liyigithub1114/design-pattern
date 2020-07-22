package com.liyi.design.pattern.structure.adapter.interfaceadapter;

//当某个对象不想实现一个接口的所有方法，
// 加入一个适配器的抽象类，所有方法皆为空方法，对象想用那个方法就可重写那个方法
public abstract class MyInterfaceAdapter implements MyInterface {

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }
}
