package com.dragontalker.principle.inversion.improve;

public class DependencyInversionImprove1 {

    public static void main(String[] args) {

        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

// 定义接口
interface IReceiver {
    String getInfo();
}

class Email implements IReceiver{
    public String getInfo() {
        return "电子邮件信息: Hello, world!";
    }
}

class WeiXin implements IReceiver{
    public String getInfo() {
        return "微信信息: Hello, world!";
    }
}

class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
