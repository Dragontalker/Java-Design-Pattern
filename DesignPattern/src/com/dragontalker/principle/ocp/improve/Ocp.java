package com.dragontalker.principle.ocp.improve;

public class Ocp {

    public static void main(String[] args) {

        // 使用, 看看存在的问题是什么
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

// 这是一个用于绘图的类[使用方]
class GraphicEditor {

    // 接收Shape对象, 然后根据type, 来绘制不同的图形
    public void drawShape(Shape s) {
        s.draw();
    }
}

// Shape类, 基类
interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

// 新增画三角形的类
class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

// 新增一个图形
class OtherGraphic implements Shape {

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}
