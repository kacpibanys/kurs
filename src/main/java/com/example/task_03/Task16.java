package com.example.task_03;

import java.util.Arrays;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][3];
        for (int j = 0; j < arr.length; j++) {
            int sum = 0;
            for (int i = 0; i < arr[i].length; j++) {
                System.out.println("Enter number for column " + (i + 1) + ":");
                arr[i][j] = sc.nextInt();
                sc.nextLine();
                //System.out.println("[" + i + "]" + "[" + j + "]" + " = " + arr[i][j]);
                sum += arr[i][j];
            }
            System.out.println("Sum for column " + (j+1) + " is: " + sum);
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
