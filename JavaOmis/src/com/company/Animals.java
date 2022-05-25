package com.company;

public class Animals {
    public static void main(String[] args) {
        Dogs dogs = new Dogs();
        dogs.say("gaf");
        Cats cats = new Cats();
        cats.say("meow");
        System.out.println(dogs.age);
        System.out.println(dogs.name);
        System.out.println(cats.age);
        System.out.println(cats.name);
    }
}
