package com.company;

public class MainArrays2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 454, 5456, 3, 43, 434, 54};
        int result = array[0] + array[1] + array[2];
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        System.out.println(res);
    }
}
