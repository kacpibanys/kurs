package com.example.task_03;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        sc.nextLine();
        int lowestNumber = Integer.MAX_VALUE;
        int newNumber;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter an element of array");
            array[i] = sc.nextInt();
            newNumber = array[i];
            if (newNumber < lowestNumber) {
                lowestNumber = newNumber;
            }
        }
        sc.close();
        System.out.println("the lowest number is " + lowestNumber);
    }
}
