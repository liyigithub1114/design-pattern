package com.liyi.design.pattern.structure.bridge;

public abstract class Phone{


    private Brand brand;
    public Phone(Brand brand){
        setBrand(brand);

    }

    public void open(){
        brand.open();
    }

    public void close(){
        brand.close();
    }


    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
