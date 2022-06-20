package com.company.exam1;

public class Fridge {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.variety = "green";
        apple.calories = 30;
        apple.amount = 1;
        System.out.println(apple.variety + " " + apple.calories + " " + apple.amount);

        Apple apple1 = new Apple("red", 25, 3);
        System.out.println(apple1.variety + " " + apple1.calories + " " + apple1.amount);

        System.out.println("Apple description: " + apple.description());
    }
}
