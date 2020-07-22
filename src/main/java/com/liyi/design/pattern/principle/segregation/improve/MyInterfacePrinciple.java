package com.liyi.design.pattern.principle.segregation.improve;

//接口隔离， 以下B 实现MyInterface1 MyInterface23 每个接口都是最小单位
public class MyInterfacePrinciple {
}

interface MyInterface1{
    void method1();
}

interface  MyInterface23{
    void method2();
    void method3();
}

interface  MyInterface45{
    void method4();
    void method5();
}

class B1 implements MyInterface1, MyInterface23 {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}

class D1 implements MyInterface1, MyInterface45 {


    @Override
    public void method1() {

    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }
}

class A1{
    public void method1(MyInterface1 myInterface1){
        myInterface1.method1();
    }

    public void method2(MyInterface23 myInterface23){
        myInterface23.method2();
    }

    public void method3(MyInterface23 myInterface23){
        myInterface23.method3();
    }

}

class C1{
    public void method1(MyInterface1 myInterface1){
        myInterface1.method1();
    }

    public void method2(MyInterface45 myInterface45){
        myInterface45.method4();
    }

    public void method3(MyInterface45 myInterface45){
        myInterface45.method5();
    }

}