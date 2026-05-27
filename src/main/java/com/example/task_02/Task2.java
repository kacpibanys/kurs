package com.example.task_02;

import java.util.Scanner;

public class Task2 {
    public static void main() {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
