package com.example.task_03;

import java.util.Arrays;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[][] matrix = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("BEFORE: ");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        //rowsy

        for (int j = 0; j < n; j++) {
            int inventory = matrix[0][j];
            matrix[0][j] = matrix[n - 1][j];
            matrix[n - 1][j] = inventory;
        }


        //diagonalsy

        for (int i = 0; i < n; i++) {
            int temp = matrix[i][i];
            matrix[i][i] = matrix[i][n - 1 - i];
            matrix[i][n - 1 - i] = temp;
        }

        System.out.println("AFTER: ");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
