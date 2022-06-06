package com.company;

import java.util.Arrays;

public class MyArray2 implements ArrayInterface2 {
    int[] array = new int[3];
    String[] names = new String[5];
    int size = 0;

    @Override
    public boolean add(int number) {
        if (size != array.length) {
            array[size] = number;
            size++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public String addName(String name) {
        if (size != names.length) {
            names[size] = name;
            size++;
            return name;
        }
        return "error";
    }

    @Override
    public void getForm() {
        System.out.println(Arrays.toString(names));
    }
}
