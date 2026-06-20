package com.example.task_03;

import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        sc.nextLine();

        float sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter an element of array");
            sum = sum + sc.nextInt();
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + sum / n);
        sc.close();
    }
}
