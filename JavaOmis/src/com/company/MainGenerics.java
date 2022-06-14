package com.company;

import java.util.ArrayList;
import java.util.List;

public class MainGenerics {
    public static void main(String[] args) {
        Animals1 ourAnimal = new Animals1();
        List animals = new ArrayList();
        animals.add("Bear");
        animals.add("Wolf");
        animals.add("Elephant");
        animals.add(5);
        animals.add(ourAnimal);
        String animal = (String) animals.get(1);
        int num = (int) animals.get(3);
        System.out.println(animal);
        System.out.println(num);

        List<String> animals1 = new ArrayList<>();
        animals1.add("bear");
        animals1.add("wolf");
        animals1.add("elephant");

        String animal1 = animals1.get(1);
        System.out.println(animal1);
    }
}

class Animals1 {

}
