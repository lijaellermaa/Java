package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainReader {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please write some letter: ");
        char letter = scn.next().toLowerCase().charAt(0);
        char letter1 = Character.toUpperCase(letter);
        int totalLetters;
        int countLetter;
        String s = null;

        BufferedReader file = null;
        try {
            file = new BufferedReader(new FileReader("file.txt"));
            String line;

            while ((line = file.readLine()) != null) {
                totalLetters = 0;
                countLetter = 0;
                String[] parts = line.split(" ");

                for (int i = 0; i < parts.length; i++) {
                    parts[i] = Character.toUpperCase(parts[i].charAt(0)) + parts[i].substring(1);
                }

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        totalLetters++;
                    }
                }

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == letter || line.charAt(i) == letter1) {
                        countLetter++;
                    }
                }

                System.out.println(Arrays.toString(parts));
                System.out.println("Words in sentences: " + parts.length);
                System.out.println("Total letters: " + totalLetters);
                System.out.println("Special letters in sentences: " + countLetter + "\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
