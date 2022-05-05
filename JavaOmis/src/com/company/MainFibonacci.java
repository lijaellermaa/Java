package com.company;

public class MainFibonacci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5
        int result;
        int num = 0;
        int num1 = 1;
        System.out.print(num + " " + num1 + " ");
        for (int i = 0; i < 10; i++) {
            result = num + num1;
            num = num1;
            num1 = result;
            System.out.print(result + " ");
        }
    }
}
