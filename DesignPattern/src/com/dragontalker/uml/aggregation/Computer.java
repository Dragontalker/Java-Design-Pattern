package com.dragontalker.uml.aggregation;

public class Computer {
    private Mouse mouse; // 鼠标可以和computer分离
    private Monitor monitor; // 显示器可以和computer分离

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}

class Mouse{}

class Monitor{}
