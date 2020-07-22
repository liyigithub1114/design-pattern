package com.liyi.design.pattern.structure.adapter.classadapter;

public class Phone {

    private Voltage5V v5;

    public Phone(Voltage5V v5){
        setV5(v5);
    }

    public void charging(){
        System.out.println(v5.output5v());
    }

    public void setV5(Voltage5V v5) {
        this.v5 = v5;
    }
}
