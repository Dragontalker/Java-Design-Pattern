package com.dragontalker.principle.ocp;

public class Ocp {

    public static void main(String[] args) {

    }
}

class GraphicEditor {
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

class Shape {
    int m_type;
}
