package com.company;

public class MainInterface {
    public static void main(String[] args) {
        Print car1 = new MyInterface("Audi", "A6");
        car1.printCar();

        Print bike1 = new MyInterface("Yamaha", "Z1");
        bike1.printBike();

        Read car2 = new MyInterface();
        car2.readCar();

        Read bike2 = new MyInterface();
        bike2.readBike();
    }
}
