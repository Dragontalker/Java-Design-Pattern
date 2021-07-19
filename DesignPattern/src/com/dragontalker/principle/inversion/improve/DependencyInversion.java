package com.dragontalker.principle.inversion.improve;

public class DependencyInversion {

    public static void main(String[] args) {

        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息: Hello, world!";
    }
}

class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
