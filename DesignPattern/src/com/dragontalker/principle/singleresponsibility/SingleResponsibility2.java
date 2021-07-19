package com.dragontalker.principle.singleresponsibility;

public class SingleResponsibility2 {
}

class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行....");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空运行....");
    }
}
