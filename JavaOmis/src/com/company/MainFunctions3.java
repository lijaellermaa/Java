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

        System.out.println(Arrays.toString(simple));
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
