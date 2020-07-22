package com.liyi.design.pattern.create.builder.usebuilder;

public class TestBuilder {
    public static void main(String[] args) {
        DirectMan directMan = new DirectMan(new CommonHouse());
        ProductTools build = directMan.build();
        System.out.println(build.toString());

        //指挥者不变，重建高楼
        directMan.setAbstractHouse(new HighHouse());
        ProductTools build1 = directMan.build();
        System.out.println(build1);
    }
}
