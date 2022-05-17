package com.company;

public class MainMaxArrays {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 45, 34, 78, 95, 567, 349};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        System.out.println("Max number from array is " + max);
    }
}
