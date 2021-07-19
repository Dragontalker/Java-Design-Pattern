package com.dragontalker.principle.inversion;

public class DependencyPass {

    public static void main(String[] args) {
        ITV tv = new SmartTV();
        IOpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(tv);
    }
}

// 方式1: 通过接口传递实现依赖
// 开关的接口
//interface IOpenAndClose {
//    void open(ITV tv); // 抽象方法, 接收接口
//}
//
//interface ITV {
//    void play();
//}
//
//// 实现接口
//class OpenAndClose implements IOpenAndClose {
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

// 方式2: 通过构造方法依赖传递
interface IOpenAndClose {
    void open(); // 抽象方法, 接收接口
}

interface ITV { // ITV接口
    void play();
}

class OpenAndClose implements IOpenAndClose {
    public ITV tv;

    public OpenAndClose(ITV tv) {
        this.tv = tv;
    }

    public void open() {
        this.tv.play();
    }
}
