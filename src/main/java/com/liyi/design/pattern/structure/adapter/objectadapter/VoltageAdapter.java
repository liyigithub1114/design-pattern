package com.liyi.design.pattern.structure.adapter.objectadapter;

//适配器， 因为class适配模式继承了一个类，在Java中，只能继承一个类，所以不方便 因此用聚合
//   实现 ： 适配者
public class VoltageAdapter implements Voltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        setVoltage220V(voltage220V);
    }

    @Override
    public int output5v() {
        int i = voltage220V.output220V();

        return i / 44;
    }

    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }
}
