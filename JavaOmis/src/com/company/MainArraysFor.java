package com.company;

import java.util.Arrays;

public class MainArraysFor {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
