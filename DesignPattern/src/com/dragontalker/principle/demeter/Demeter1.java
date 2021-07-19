package com.dragontalker.principle.demeter;

public class Demeter1 {

    public static void main(String[] args) {

    }
}

class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
