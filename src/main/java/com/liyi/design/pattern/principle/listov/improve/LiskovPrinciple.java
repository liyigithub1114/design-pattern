package com.liyi.design.pattern.principle.listov.improve;

//里氏替换原则
//任何 基类能够出现的地方能透明的使用其子类及其对象
//即，尽量少的重写继承的方法
//里氏替换原则告诉我们，继承实际上让两个类耦合性增强了，在适当的情况下，可 以通过聚合，组合，依赖 来解决问题。.
public class LiskovPrinciple {
    public static void main(String[] args) {

    }
}

class Base{

}

class Func3{
    public int func(int a, int b){
        return a - b;
    }
}

class Func4 extends Base {

    //使用依赖的方式， 将Func3放入， 使用其功能
    private Func3 func3;

    public Func4(Func3 func3){
        this.func3 = func3;
    }

    public int func(int a, int b){
        return a + b;
    }

    public int func2(int a, int b){
        return func(a, b) + 9;
    }

    public int func3(int a, int b){
        return func3.func(a, b);
    }
}
