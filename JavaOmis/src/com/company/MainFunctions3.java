package com.company;

import java.util.Arrays;

public class MainFunctions3 {
    public static void main(String[] args) {
        int length = 1000;
        int[] simple = new int[length];
        int n = 0;

        for (int i = 0; n < length; i++) {
            if (checkSimple(i)) {
                simple[n] = i;
                n++;
            }
        }

        int k = 0;
        int len = 10;
        int[] result = new int[len];
        int square = simple[999] * simple[999];
        int count = 0;

        for (int i = square; k < len; i++) {
            if (checkSimple(i)) {
                result[k] = i;
                k++;
            }
            count++;
        }

        System.out.println(Arrays.toString(simple));
        System.out.println(Arrays.toString(result));
        System.out.println(count);
    }

    public static boolean checkSimple(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
