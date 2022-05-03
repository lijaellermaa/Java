package com.company;

public class MainFor1 {
    public static void main(String[] args) {
        for (int k = 0; k < 23; k++) {
            System.out.print("* ");
        }
        for (int i = 1; i < 11; i++) {
            System.out.println();
            System.out.print("*" + "\t");
            for (int j = 1; j < 11; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 23; i++) {
            System.out.print("* ");
        }
//        System.out.format("      ");
//        for (int i = 1; i <= 11; i++) {
//            System.out.format("%4d", i);
//        }
//        System.out.println();
//        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * *");
//
//        for (int i = 1; i <= 11; i++) {
//            System.out.format("%4d *", i);
//            for (int j = 1; j <= 11; j++) {
//                System.out.format("%4d", i * j);
//            }
//            System.out.println();
//        }
    }
}
