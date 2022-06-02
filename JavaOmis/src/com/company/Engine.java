package com.company;

public class Engine {
    int power;
    String fuelType;
    boolean hybridOrNot;
    String color;
    String hybridType;

    Engine(int power, String fuelType, boolean hybridOrNot, String color) {
        this.power = power;
        this.fuelType = fuelType;
        this.hybridOrNot = hybridOrNot;
        this.color = color;
    }

    public void characteristics() {

    }

    public void convert() {
        if (!hybridOrNot) {
            hybridType = "Not Hybrid";
        } else {
            hybridType = "Hybrid Engine";
        }
    }
}
