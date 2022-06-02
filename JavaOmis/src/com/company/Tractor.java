package com.company;

public class Tractor extends Engine {
    int seats;

    Tractor(int power, String fuelType, boolean hybridOrNot, String color, int seats) {
        super(power, fuelType, hybridOrNot, color);
        this.seats = seats;
    }

    public void characteristics() {
        super.convert();
        System.out.println("Tractor's Power: " + power);
        System.out.println("Tractor's Fuel Type: " + fuelType);
        System.out.println("Tractor (hybrid or not): " + hybridType);
        System.out.println("Tractor's color: " + color);
        System.out.println("Tractor's seats: " + seats);
    }
}
