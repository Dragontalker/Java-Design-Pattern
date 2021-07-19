package com.dragontalker.principle.ocp.improve;

public class Ocp {

    public static void main(String[] args) {

        // 使用, 看看存在的问题是什么
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

// 这是一个用于绘图的类[使用方]
class GraphicEditor {

    // 需要增加: 绘制三角形
    public void drawTriangle(Shape r) {
        System.out.println("绘制三角形");
    }
}

// Shape类, 基类
abstract class Shape {
    int m_type;
    public abstract void draw();
}

class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

// 新增画三角形的类
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}
