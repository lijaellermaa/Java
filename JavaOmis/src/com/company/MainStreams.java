package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class MainStreams {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        Arrays.stream(array).forEach(x -> System.out.println(x));
        System.out.println(Arrays.stream(array).sum());

        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(10);
        array1.add(15);
        array1.add(20);
        array1.add(25);
        array1.add(30);
        array1.add(35);
        array1.add(40);
        array1.add(45);
        array1.add(50);

        array1.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();

        Stream<Integer> stream = array1.stream();
        stream.forEach(System.out::print);
        System.out.println();
        stream = array1.stream();
        stream.forEach(System.out::print);
        System.out.println();
        stream = array1.stream();
        System.out.println(stream.count());

        int max = array1.stream().max(Integer::compare).get();
        System.out.println("Max is " + max);

//        for (Integer i : array1) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }

        array1.stream().filter(i -> i % 2 != 0).forEach(System.out::println);
    }
}
