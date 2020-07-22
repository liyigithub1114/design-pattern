package com.liyi.design.pattern.principle.singleresponsibility;

/**
 * 1.单一职责原则（细粒度）
        对于类来说， 一个类只应该负责一个职责，若负责多个职责可能会导致错误
    假如类User 负责两个不同的职责， 职责A的需求变更而导致职责B的的执行错误，
    就违背了单一职责原则模式，因此每个类的职责需要更加专一， User只负责用户
    相关的职责，Order只负责订单相关的职责， 分工更明确，更容易维护
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("公交车");
        vehicle.run("飞机");
    }


}

//违反了单一设计模式， 对于类Vehicle应该只有一种在公路上行驶的职责
//而对于飞机，船等职责，应该属于其他的职责
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上行驶");
    }
}