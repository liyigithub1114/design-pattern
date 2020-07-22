package com.liyi.design.pattern.principle.inversion;

// 依赖倒转原则  --> 面向接口编程
// 高层模块不应该依赖底层模块
// 抽象不应该依赖于细节， 细节依赖于抽象
public class MyDependenceInversion {

    public static void main(String[] args) {
    }
}

class Email{
    public void getInfo(){
        System.out.println("Email : hello, world");
    }
}

//若此时还有微信， QQ等接受信息的方式，岂不是要重写
class Receive{
    public void receive(Email email){
        email.getInfo();
    }
}
