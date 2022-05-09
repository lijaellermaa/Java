package com.company;

import java.util.Scanner;

public class MainWhileSwitch {
    public static void main(String[] args) {
        int num1, num2, result = 0;
        char sym;
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        num1 = scn.nextInt();

        System.out.println("Please enter second number: ");
        num2 = scn.nextInt();

        System.out.println("Please enter an operation (+, -, /, *): ");
        sym = scn.next().charAt(0);

        while (true) {
            if (sym == '+') {
                result = num1 + num2;
                break;
            } else if (sym == '-') {
                result = num1 - num2;
                break;
            } else if (sym == '/') {
                result = num1 / num2;
                break;
            } else if (sym == '*') {
                result = num1 * num2;
                break;
            } else {
                System.out.println("Please enter an operation (+, -, /, *): ");
                sym = scn.next().charAt(0);
            }
        }
        System.out.println(result);
    }
}
