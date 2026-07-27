package com.example.task_03;

import java.util.Scanner;

public class Task89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        System.out.println("Enter X number");
        int x = sc.nextInt();
        int xCounter = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter an element of array");
            arr[i] = sc.nextInt();
            if (arr[i] == x) {
                xCounter = xCounter + 1;
            }
        }
        if (xCounter > 0) {}
        sc.close();
        System.out.println("Found! The number " + x + " appears " + xCounter + " times in the array " );
    }
}
