package com.liyi.design.pattern.principle.openclose.improve;


public class OcpPrinciple {
    public static void main(String[] args) {

    }
}

class GraphicEditor{
    public void draw(Shape shape){
        shape.draw();
    }
}

interface Shape{
    public void draw();
}

class Ranctangle implements Shape {

    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("圆形");
    }
}