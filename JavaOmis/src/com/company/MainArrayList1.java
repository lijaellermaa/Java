package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class MainArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("Lexus");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("BMW");

        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println(cars);
    }
}
