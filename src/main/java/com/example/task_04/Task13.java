package com.example.task_04;

import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c" };
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    public static String[] reverseArray(String[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }
}
