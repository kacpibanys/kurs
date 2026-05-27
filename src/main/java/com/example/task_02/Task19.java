package com.example.task_02;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of grades: ");
        double n = sc.nextDouble();
        sc.nextLine();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter a grade: ");
            sum = sum + sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("Your aberage is: " + sum/n);

    }
}
