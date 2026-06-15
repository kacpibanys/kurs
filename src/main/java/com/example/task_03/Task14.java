package com.example.task_03;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = counter;
                counter++;
                System.out.printf("%d\t", arr[i][j]);

            }
            System.out.println();
        }

    }
}
