package com.liyi.design.pattern.principle.singleresponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("船");
    }
}

//这种方法虽然符合单一设计原则 但是不仅要修改服务端，还要修改客户端
//对于客户来说， 行驶方式只是一种交通工具的不同，因此，可实现方法上的单一原则SingleResponsibility3
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上行驶");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在空中行驶");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水上行驶");
    }
}