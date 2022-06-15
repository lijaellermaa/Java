package com.company;

import java.util.HashMap;

public class MainGenerics1 {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 10;

        String a1 = "Hello";
        String b1 = "World";

        print(a, b);
        print(a1, b1);

        printMap("Estonia", "Tallinn");
        printMap(1, "Estonia");
        printMap("Estonia", 1);
    }

    public static <KV> void printMap(KV key, KV value) {
        HashMap<KV, KV> map = new HashMap<>();
        map.put(key, value);
        System.out.println(map);
    }

    public static <T> void print(T a, T b) {
        System.out.println(a + " " + b);
    }

//    public static void print(Integer a, Integer b) {
//        System.out.println(a + " " + b);
//    }
//
//    public static void print(String a, String b) {
//        System.out.println(a + " " + b);
//    }
}
