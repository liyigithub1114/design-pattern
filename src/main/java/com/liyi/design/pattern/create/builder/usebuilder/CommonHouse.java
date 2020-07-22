package com.liyi.design.pattern.create.builder.usebuilder;

public class CommonHouse extends AbstractHouse {
    @Override
    String buildBase() {
        return "普通房子打地基";
    }

    @Override
    String buildWalls() {
        return "普通房子砌墙";
    }

    @Override
    String roofed() {
        return "普通房子封顶";
    }

    @Override
    String end() {
        return "普通房子完结";
    }
}
