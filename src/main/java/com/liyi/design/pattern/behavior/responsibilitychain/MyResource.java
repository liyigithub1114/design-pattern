package com.liyi.design.pattern.behavior.responsibilitychain;

public class MyResource {

    private int price;

    public MyResource(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
