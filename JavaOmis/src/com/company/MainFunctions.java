package com.company;

public class MainFunctions {
    public static void main(String[] args) {
        print();
        print2("Anna");
    }

    public static void print() {
        System.out.println("Hello world!");
    }

    public static void print2(String message) {
        System.out.println("Hello " + message);
    }
}
