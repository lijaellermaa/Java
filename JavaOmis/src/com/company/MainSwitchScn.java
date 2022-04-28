package com.company;

import java.util.Scanner;

public class MainSwitchScn {
    public static void main(String[] args) {
        int num1, num2, result;
        char sym;
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        num1 = scn.nextInt();

        System.out.println("Please enter second number: ");
        num2 = scn.nextInt();

        System.out.println("Please enter an operation (+, -, /, *): ");
        sym = scn.next().charAt(0);

        switch (sym) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Error");
            return;
        }
        System.out.println(result);
    }
}
