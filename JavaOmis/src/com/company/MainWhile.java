package com.company;

public class MainWhile {
    public static void main(String[] args) {
//        boolean isTrue = true;
//        int num = 0;
//        while (isTrue) {
//            num++;
//            if (num > 5) {
//                isTrue = false;
//            }
//            System.out.println("Hello");
//        }

        int num = 0;
        while (num < 10) {
            System.out.println("Hello world!");
            num++;
            if (num > 5) {
                break;
            }
        }
    }
}
