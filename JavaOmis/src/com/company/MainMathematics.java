package com.company;

import java.lang.Math;

public class MainMathematics {
    public static void main(String[] args) {
        float num1 = 5.4f;
        System.out.println("Round " + Math.round(num1));

        float num2 = 5.4f;
        System.out.println("ceil " + Math.ceil(num2));

        float num3 = 5.4f;
        System.out.println("floor " + Math.floor(num3));

        int num4;

        for (int i = 0; i < 5; i++) {
            num4 = (int) Math.round(Math.random() * 100);
            System.out.println(num4);
        }

        int num5, num6;
        num5 = 40;
        num6 = 70;
        System.out.println("MAX is " + Math.max(num5, num6));
        System.out.println("MIN is " + Math.min(num5, num6));

        int num7 = 3;
        System.out.println(Math.pow(num7, 3));

        int num8 = 16;
        System.out.println(Math.sqrt(num8));
    }
}
