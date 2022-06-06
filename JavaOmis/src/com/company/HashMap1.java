package com.company;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<String, String>();
        capitals.put("Estonia", "Tallinn");
        capitals.put("Norway", "Oslo");
        capitals.put("England", "London");

        System.out.println(capitals);

        System.out.println(capitals.get("Norway"));

        capitals.remove("England");

        System.out.println(capitals);

        for (String i : capitals.values()) {
            System.out.println(i);
        }

        for (String i : capitals.keySet()) {
            System.out.println(i);
        }

        capitals.clear();

        System.out.println(capitals);

        HashMap<String, Integer> namesAge = new HashMap<String, Integer>();
        namesAge.put("Bob", 40);
        namesAge.put("John", 50);

        int sum = 0;
        for (int i : namesAge.values()) {
            sum += i;
        }

        int average = sum / namesAge.size();

        System.out.println(average);
    }
}
