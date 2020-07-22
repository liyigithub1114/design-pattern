package com.liyi.design.pattern.principle.segregation;

//接口隔离原则，
//类A通过接口MyInterface依赖类B，
//类C通过接口MyInterface依赖类D，
public interface MyInterface {
    void method1();
    void method2();
    void method3();
    void method4();
    void method5();
}

class B implements MyInterface {

    @Override
    public void method1() {
        System.out.println("B 实现了 MyInterface 的 method1方法");
    }

    @Override
    public void method2() {
        System.out.println("B 实现了 MyInterface 的 method2方法");
    }

    @Override
    public void method3() {
        System.out.println("B 实现了 MyInterface 的 method3方法");
    }

    @Override
    public void method4() {
        System.out.println("B 实现了 MyInterface 的 method4方法");
    }

    @Override
    public void method5() {
        System.out.println("B 实现了 MyInterface 的 method5方法");
    }
}

class D implements MyInterface {

    @Override
    public void method1() {
        System.out.println("D 实现了 MyInterface 的 method1方法");
    }

    @Override
    public void method2() {
        System.out.println("D 实现了 MyInterface 的 method2方法");
    }

    @Override
    public void method3() {
        System.out.println("D 实现了 MyInterface 的 method3方法");
    }

    @Override
    public void method4() {
        System.out.println("D 实现了 MyInterface 的 method4方法");
    }

    @Override
    public void method5() {
        System.out.println("D 实现了 MyInterface 的 method5方法");
    }
}

//这种方式， B 和 D都实现了MyInterface中的 5 个方法，事实上却用不到 5个方法，A只用了123， C只用了135
//因此不符合    一个类对另一个类的依赖 应该建立在最小的接口上
class A{
    public void method1(MyInterface myInterface){
        myInterface.method1();
    }
    public void method2(MyInterface myInterface){
        myInterface.method2();
    }
    public void method3(MyInterface myInterface){
        myInterface.method3();
    }
}

class C{
    public void method1(MyInterface myInterface){
        myInterface.method1();
    }
    public void method4(MyInterface myInterface){
        myInterface.method4();
    }
    public void method5(MyInterface myInterface){
        myInterface.method5();
    }
}