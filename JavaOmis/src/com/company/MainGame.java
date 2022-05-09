package com.company;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        int num1, num2, result;
        String yesOrNo;
        boolean isTrue = true;

        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        System.out.println("This is a game!");
        System.out.println("Rules: First number is a secret. Summa of two numbers must be lower of 100");
        num1 = (int) Math.round(Math.random() * 100);
        System.out.print("Please enter number2: ");
        num2 = scn.nextInt();

        while (isTrue) {
            if (num2 >= 100) {
                System.out.println("Second number MUST be less than 100");
                System.out.print("Please enter second number again: ");
                num2 = scn.nextInt();
            } else if (num2 <= 10) {
                System.out.println("Second number MUST be bigger than 10");
                System.out.print("Please enter second number again: ");
                num2 = scn.nextInt();
            } else {
                result = num1 + num2;
                if (result < 100) {
                    System.out.println("You have won the game, because summa of two numbers was " + result);
                } else {
                    System.out.println("Game Over!");
                    System.out.println("Because summa of two numbers was " + result);
                }
                System.out.print("Would you like to play again? (yes/no): ");
                yesOrNo = scn1.nextLine().toLowerCase();
                if (yesOrNo.equals("yes")) {
                    num1 = (int) Math.round(Math.random() * 100);
                    System.out.print("Please enter number2: ");
                    num2 = scn.nextInt();
                } else {
                    isTrue = false;
                }
            }
        }
    }
}
