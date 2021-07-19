package com.dragontalker.uml.composition;

public class Computer {
    // 从aggregation升级为composition
    private Mouse mouse = new Mouse();
    private Monitor monitor = new Monitor();
}

class Mouse {}
class Monitor {}
