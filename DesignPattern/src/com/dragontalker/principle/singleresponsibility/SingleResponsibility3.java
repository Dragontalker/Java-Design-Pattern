package com.dragontalker.principle.singleresponsibility;

public class SingleResponsibility3 {

    public static void main(String[] args) {

    }
}

class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行....");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空上运行....");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中上运行....");
    }
}

