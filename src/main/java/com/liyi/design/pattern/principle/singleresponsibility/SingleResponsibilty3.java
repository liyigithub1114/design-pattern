package com.liyi.design.pattern.principle.singleresponsibility;

public class SingleResponsibilty3 {
    public static void main(String[] args) {
        MyVehicle myVehicle = new MyVehicle();
        myVehicle.runOnRoad("汽车");
        myVehicle.runOnAir("飞机");
        myVehicle.runOnWater("船");
    }
}

class MyVehicle{
    public void runOnRoad(String vehicle){
        System.out.println(vehicle + "行驶在公路上");
    }

    public void runOnAir(String vehicle){
        System.out.println(vehicle + "行驶在空中");
    }

    public void runOnWater(String vehicle){
        System.out.println(vehicle + "行驶在水上");
    }
}