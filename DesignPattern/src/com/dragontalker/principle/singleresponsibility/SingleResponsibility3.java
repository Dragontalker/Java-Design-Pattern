package com.dragontalker.principle.singleresponsibility;

public class SingleResponsibility3 {

    public static void main(String[] args) {

        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("摩托车", 3);
        vehicle2.run("汽车", 20);
        vehicle2.runWater("轮船");
        vehicle2.runAir("飞机");
    }
}

// 方式3的分析
// 1. 这种修改方法没有对原来的类做大的修改, 只是增加方法
// 2. 这里虽然没有在类这个级别上遵守单一职责原则, 但是在方法级别上, 仍然是遵守单一职责
class Vehicle2 {
    public void run(String vehicle, int time) {
        if (time > 10 && time < 15) {
            System.out.println(vehicle + "在公路上运行....");
        }
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空上运行....");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中上运行....");
    }

    // 方法2
    // ...
    // ...
    // ...
    // 如果方法很多很臃肿, 则需要进一步拆分
}

