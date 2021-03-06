package com.liyi.design.pattern.principle.openclose;

public class Ocp {
    public static void main(String[] args) {

    }
}

//这样每次需要增加一个绘制的图形，需要修改的方法太多
class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.m_type == 1) drawRectangle(s);
        else if (s.m_type == 2) drawCircle(s);
        //修改一次
    }

    public void drawRectangle(Shape r) {
        System.out.println(" 矩形 ");
    }

    public void drawCircle(Shape r) {
        System.out.println(" 圆形 ");
    }

    //修改一次
}

class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}