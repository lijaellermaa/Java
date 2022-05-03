package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MainArrays4 {
    public static void main(String[] args) {
        int[] nums;
        int length;
        int[] nums2;
        int count = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter please length of an array: ");
        length = scn.nextInt();
        nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("nums[" + nums[i] + "] = ");
            nums[i] = scn.nextInt();
            if (nums[i] > 50) {
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));

        nums2 = new int[count];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 50) {
                nums2[index] = nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(nums2));
    }
}
