package com.example.task_03;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter number of columns");
        int y = sc.nextInt();
        sc.nextLine();

        int[][] matrix = new int[x][y];
        int lowestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Enter number: ");
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] < lowestNumber) {
                    System.out.println("NEW LOWEST");
                    lowestNumber = matrix[i][j];
                }

            }
        }
        System.out.println("the lowest number is: " + lowestNumber);

        sc.close();
    }
}
