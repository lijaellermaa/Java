package com.company;

public class MainWhile1 {
    public static void main(String[] args) {
//        int odd = 0;
//        int even = 0;
//        while (odd < 100) {
//            odd++;
//            if (odd % 2 == 1) {
//                System.out.print(odd + " ");
//            }
//        }
//        System.out.println();
//        while (even < 100) {
//            even++;
//            if (even % 2 == 0) {
//                System.out.print(even + " ");
//            }
//        }

        int num = 1;
        while (num < 101) {
            System.out.print(num + " ");
            if (num == 99) {
                System.out.println();
                num = 0;
            }
            num += 2;
        }
    }
}
