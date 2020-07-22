package com.liyi.design.pattern.create.builder.usebuilder;

//构造者模式 角色 : 指导者
public class DirectMan {
    AbstractHouse abstractHouse;


    public DirectMan(AbstractHouse abstractHouse){
        setAbstractHouse(abstractHouse);
    }

    public ProductTools build(){
        ProductTools result = abstractHouse.getResult();
        result.setBase(abstractHouse.buildBase());
        result.setWalls(abstractHouse.buildWalls());
        result.setRoofed(abstractHouse.roofed());
        result.setEnd(abstractHouse.end());
        return result;
    }

    public void setAbstractHouse(AbstractHouse abstractHouse) {
        this.abstractHouse = abstractHouse;
    }
}
