package com.liyi.design.pattern.principle.inversion.improve;

public class MyDependeceInversionPrinciple {
    public static void main(String[] args) {

    }
}

class Receive{
    public void receive(IReceive iReceive){
        iReceive.getInfo();
    }
}

interface IReceive{
    public void getInfo();
}

class WeChat implements IReceive {

    @Override
    public void getInfo() {
        System.out.println("WeChat : hello, world");
    }
}

class Email implements IReceive {
    public void getInfo(){
        System.out.println("Email : hello, world");
    }
}
