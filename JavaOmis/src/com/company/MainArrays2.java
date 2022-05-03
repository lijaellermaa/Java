package com.company;

public class MainArrays2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 3 || i == array.length - 1) {
                result += array[i];
            }
        }
//        res += array[array.length - 1];
        System.out.println("result is " + result);
    }
}
