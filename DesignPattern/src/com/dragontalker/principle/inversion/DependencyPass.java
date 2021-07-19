package com.dragontalker.principle.inversion;

public class DependencyPass {

    public static void main(String[] args) {
        IOpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(new ITV() {
            @Override
            public void play() {
                System.out.println("setter方法创建的电视播放....");
            }
        });
        openAndClose.open();
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
//interface IOpenAndClose {
//    void open(); // 抽象方法, 接收接口
//}
//
//interface ITV { // ITV接口
//    void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//    public ITV tv;
//
//    public OpenAndClose(ITV tv) { // 构造器传递
//        this.tv = tv;
//    }
//
//    public void open() {
//        this.tv.play();
//    }
//}

// 方式3: 通过setter方法传递
interface IOpenAndClose {
    void open();
    void setTv(ITV tv);
}

interface ITV {
    void play();
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    public void open() {
        this.tv.play();
    }
}
