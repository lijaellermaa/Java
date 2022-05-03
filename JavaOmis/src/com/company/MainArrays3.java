package com.company;

import java.util.Arrays;

public class MainArrays3 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 6, 4, 7, 7, 9, 4, 3, 7, 2, 1};
        int specialNum = 7;
        int specialNum1 = 4;
        for (int i = 0; i < array.length; i++) {
            if (specialNum == array[i] || specialNum1 == array[i]) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
