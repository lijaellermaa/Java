package com.company;

import java.util.Scanner;

public class MainScn {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int num1, num2, result;
//        System.out.println("Please enter first number: ");
//        num1 = scn.nextInt();
//        System.out.println("Please enter second number: ");
//        num2 = scn.nextInt();
//        result = num1 + num2;
//        System.out.println("Result is " + result);

        Scanner scn = new Scanner(System.in);
        float num1, num2, result;
        System.out.println("Please enter first number: ");
        num1 = scn.nextFloat();
        System.out.println("Please enter second number: ");
        num2 = scn.nextFloat();
        result = num1 + num2;
        System.out.println("Result is " + result);
    }
}
