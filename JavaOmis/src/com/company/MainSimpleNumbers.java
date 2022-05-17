package com.company;

import java.util.Arrays;

public class MainSimpleNumbers {
    public static void main(String[] args) {
        int length = 1000;
        int[] simple = new int[length];
        int n = 0;
        boolean isTrue;

        for (int i = 2; n < length; i++) {
            isTrue = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isTrue = false;
                }
            }
            if (isTrue) {
                simple[n] = i;
                n++;
            }
        }

        System.out.println(Arrays.toString(simple));
    }
}
