package com.example.task_04;

import static java.lang.Integer.MIN_VALUE;

public class Task11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arrHighestNumber(arr));
    }

    public static int arrHighestNumber(int[] arr) {
        int highest = MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        return highest;
    }
}
