package com.company;

public class Person {
    public static void main(String[] args) {
        PersonDemo person1 = new PersonDemo();
        PersonDemo person2 = new PersonDemo();
        System.out.println(person1.age);
        System.out.println(person1.name);
        System.out.println(person1.height);
        person2.age = 30;
        System.out.println(person2.age);
        person1.say("Maks");
    }
}
