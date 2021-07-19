package com.dragontalker.principle.inversion;

public class DependencyPassMethod1 {

    public static void main(String[] args) {
        ITV tv = new SmartTV();
        IOpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(tv);
    }
}

// 方式1: 通过接口传递实现依赖
// 开关的接口
interface IOpenAndClose {
    void open(ITV tv); // 抽象方法, 接收接口
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

class SmartTV implements ITV {
    public void play() {
        System.out.println("智能电视: 播放中...");
    }
}
