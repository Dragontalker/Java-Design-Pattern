package com.dragontalker.principle.inversion;

public class DependencyInversion {

    public static void main(String[] args) {

    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息: Hello, world!";
    }
}

// 完成Person接收消息的功能
// 方式1完成
class Person {
    public void receive(Email email) {

    }
}
