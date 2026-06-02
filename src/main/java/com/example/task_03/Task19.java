package com.example.task_03;

import java.util.Arrays;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int x = sc.nextInt();
        sc.nextLine();

        String elements = "";

        int[][] matrix = new int[x][x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.println("Enter number: ");
                matrix[i][j] = sc.nextInt();

                if (i == j) {
                   elements = elements + matrix[i][j];
                }

            }
        }
        System.out.println("Main diagonal is: " + elements);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
