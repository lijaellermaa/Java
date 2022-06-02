package com.company;

public class Track extends Engine {
    int cargoCapacity;

    Track(int power, String fuelType, boolean hybridOrNot, String color, int cargoCapacity) {
        super(power, fuelType, hybridOrNot, color);
        this.cargoCapacity = cargoCapacity;
    }

    public void characteristics() {
        super.convert();
        System.out.println("Track's Power: " + power);
        System.out.println("Track's Fuel Type: " + fuelType);
        System.out.println("Track (hybrid or not): " + hybridType);
        System.out.println("Track's color: " + color);
        System.out.println("Track's cargo capacity: " + cargoCapacity);
    }
}
