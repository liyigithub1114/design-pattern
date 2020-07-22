package com.liyi.design.pattern.structure.adapter.classadapter;

//适配器， 继承 ： 被适配者 220V；   实现 ： 适配者
public class VoltageAdapter extends Voltage220V implements Voltage5V{

    @Override
    public int output5v() {
        int vol = output220V();

        return vol / 44;
    }
}
