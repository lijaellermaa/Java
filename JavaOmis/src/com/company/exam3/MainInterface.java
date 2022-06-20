package com.company.exam3;

public class MainInterface {
    public static void main(String[] args) {
        Print fruit = new MyInterface("green", 1);
        fruit.printFruit("apple");

        Print berry = new MyInterface("red", 3);
        berry.printBerry("strawberry");
    }
}
