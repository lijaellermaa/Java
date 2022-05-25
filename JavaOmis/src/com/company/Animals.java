package com.company;

public class Animals {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.say("gaf");
        Cats cat = new Cats();
        cat.say("meow");
        System.out.println(dog.age);
        System.out.println(dog.name);
        System.out.println(cat.age);
        System.out.println(cat.name);
    }
}
