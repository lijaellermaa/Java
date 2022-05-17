package com.company;

public class MainFunctions2 {
    public static void main(String[] args) {
        int[] numbers = new int[] {45, 32, 5566, 2455, 167};
        System.out.println("Max number from array is " + getMaxValue(numbers));
        System.out.println("Min number from array is " + getMinValue(numbers));
    }

    public static int getMaxValue(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int getMinValue(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
}
