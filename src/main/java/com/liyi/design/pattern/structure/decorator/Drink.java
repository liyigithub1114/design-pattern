package com.liyi.design.pattern.structure.decorator;

public abstract class Drink {

    String des;
    float price;

    public void setDes(String des) {
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    abstract float cost();
}
