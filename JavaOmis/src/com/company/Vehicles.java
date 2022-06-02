package com.company;

public class Vehicles {
    public static void main(String[] args) {
        Engine tractor = new Tractor(900, "Diesel", false, "Red", 1);
        tractor.characteristics();

        System.out.println();

        Engine track = new Track(700, "Gasoline", true, "Yellow", 100);
        track.characteristics();
    }
}
