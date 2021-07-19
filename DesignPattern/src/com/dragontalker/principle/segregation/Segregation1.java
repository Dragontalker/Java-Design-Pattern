package com.dragontalker.principle.segregation;

public class Segregation1 {
}

// 接口
interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1....");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2....");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3....");
    }

    @Override
    public void operation4() {
        System.out.println("B 实现了 operation4....");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现了 operation5....");
    }
}
