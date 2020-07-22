package com.liyi.design.pattern.structure.bridge;

public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand){
        super(brand);
    }

    @Override
    public void open() {
        System.out.println("折叠手机");
        super.open();
    }

    @Override
    public void close() {
        System.out.println("折叠手机");
        super.close();
    }
}
