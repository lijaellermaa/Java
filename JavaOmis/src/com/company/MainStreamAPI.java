package com.company;

import java.util.ArrayList;

public class MainStreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

//        for (int i : numbers) {
//            System.out.println(i);
//        }

        numbers.forEach(System.out::println);

//        System.out.println(returnValue(numbers));
    }

//    public static int returnValue(ArrayList<Integer> nums) {
//        for (int i : nums) {
//
//        }
//    }
}
