package com.company;

import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Toyota");

        System.out.println(cars.get(1));
        cars.set(0, "Volvo");
        System.out.println(cars.size());
        cars.remove(2);
        cars.clear();
        System.out.println(cars);
    }
}
