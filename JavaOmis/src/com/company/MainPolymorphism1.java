package com.company;

public class MainPolymorphism1 {
    public static void main(String[] args) {
        Person1 person1 = new Footer();
        person1.move();

        Person1 person2 = new Driver();
        person2.move();
    }
}
