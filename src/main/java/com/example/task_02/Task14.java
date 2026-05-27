package com.example.task_02;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a starting number");
        int start = sc.nextInt();
        System.out.println("Enter a ending number");
        int end = sc.nextInt();
        sc.close();
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 || i % 5 == 0)  {
                System.out.println(i);
            }else  {
                continue;
            }
        }
    }
}
