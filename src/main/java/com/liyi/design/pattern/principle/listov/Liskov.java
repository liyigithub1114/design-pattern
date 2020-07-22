package com.liyi.design.pattern.principle.listov;

//里氏替换原则
//任何 基类能够出现的地方能透明的使用其子类及其对象
//即，尽量少的重写继承的方法
//里氏替换原则告诉我们，继承实际上让两个类耦合性增强了，在适当的情况下，可 以通过聚合，组合，依赖 来解决问题。.
public class Liskov {
    public static void main(String[] args) {
        Func1 func1= new Func1();
        int res = func1.func(1,8);
        System.out.println("1 - 8 = : "+ res);

        Func2 func2 = new Func2();
        res = func2.func(1,8);
        System.out.println("1 - 8 = : " + res);
    }
}

class Func1{
    public int func(int a, int b){
        return a - b;
    }
}

class Func2 extends Func1 {

    public int func(int a, int b){
        return a + b;
    }

    public int func2(int a, int b){
        return func(a, b) + 9;
    }
}
