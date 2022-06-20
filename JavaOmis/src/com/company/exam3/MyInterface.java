package com.company.exam3;

public class MyInterface implements Print {
    String variety;
    int amount;

    MyInterface() {

    }

    MyInterface(String variety, int amount) {
        this.variety = variety;
        this.amount = amount;
    }

    @Override
    public void printFruit(String name) {
        System.out.println(name + " " + variety + " " + amount);
    }

    @Override
    public void printBerry(String name) {
        System.out.println(name + " " + variety + " " + amount);
    }
}
