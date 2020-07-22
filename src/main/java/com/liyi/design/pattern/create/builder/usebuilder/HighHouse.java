package com.liyi.design.pattern.create.builder.usebuilder;

public class HighHouse extends AbstractHouse {
    @Override
    String buildBase() {
        return "高楼打地基";
    }

    @Override
    String buildWalls() {
        return "高楼砌墙";
    }

    @Override
    String roofed() {
        return "高楼封顶";
    }

    @Override
    String end() {
        return "高楼完结";
    }
}
