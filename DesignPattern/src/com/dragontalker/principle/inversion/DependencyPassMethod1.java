package com.dragontalker.principle.inversion;

public class DependencyPassMethod1 {

    public static void main(String[] args) {

    }
}

// 方式1: 通过接口传递实现依赖
// 开关的接口
interface IOpenAndClose {
    void open(ITV tv);
}

interface ITV {
    void play();
}

// 实现接口
class OpenAndClose implements IOpenAndClose {
    public void open(ITV tv) {
        tv.play();
    }
}
