package com.liyi.design.pattern.create.builder.usebuilder;

//构建者模式 角色 ： 产品
public class ProductTools {

    private String base;
    private String walls;
    private String roofed;

    private String end;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    @Override
    public String toString() {
        return "ProductTools{" +
                "base='" + base + '\'' +
                ", walls='" + walls + '\'' +
                ", roofed='" + roofed + '\'' +
                ", end='" + end + '\'' +
                '}';
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
