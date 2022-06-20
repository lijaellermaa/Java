package com.company;

import java.util.Scanner;

public class MainArrays7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please write some sentence or word: ");
        String someString = scn.nextLine();
        System.out.print("Please write some letter: ");
        char someChar = scn.next().charAt(0);
        int count = 0;
        int totalLetters = 0;
        int totalWords = 0;
        String[] words = someString.split(" ");

        for (String element : words) {
            if (!element.equals("")) {
                totalWords++;
            }
        }
        System.out.println("Total words count: " + totalWords);

        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) != ' ') {
                totalLetters++;
            }
        }
        System.out.println("Total letters count: " + totalLetters);

        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == someChar) {
                count++;
            }
        }
        System.out.print("Letter " + someChar + " count: " + count);
    }
}
