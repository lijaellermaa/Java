package com.company;

public class MainMaxMinArrays {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 45, 34, 78, 95, 567, 349};
        int max, min;
        max = min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        System.out.println("Max number from array is " + max);
        System.out.println("Min number from array is " + min);
    }
}
