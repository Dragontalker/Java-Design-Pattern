package com.dragontalker.principle.ocp;

public class Ocp {

    public static void main(String[] args) {

    }
}

// 这是一个用于绘图的类
class GraphicEditor {
    // 接收Shape对象, 然后根据type, 来绘制不同的图形
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("矩形");
    }

    public void drawCircle(Shape r) {
        System.out.println("圆形");
    }
}

// Shape类, 基类
class Shape {
    int m_type;
}
