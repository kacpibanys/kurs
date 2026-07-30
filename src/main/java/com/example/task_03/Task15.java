package com.example.task_03;

public class Task15 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 4, 3, 5},
                {3, 4, 4, 2},
                {5, 5, 4, 4}
        };
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
