package com.dragontalker.singletton.type1;

public class SingletonTest01 {
}

// 饿汉式(静态变量)

class Singleton {

    // 1. 构造器私有化, 外部不能new
    private Singleton() {

    }

    // 2. 本类内部创建对象实例
    private final static Singleton instance = new Singleton();


}
