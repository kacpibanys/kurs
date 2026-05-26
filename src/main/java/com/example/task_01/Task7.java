package com.example.task_01;

import java.util.Scanner;

public class Task7 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your age: ");

        int age = sc.nextInt();
        String status = (age >= 18) ? "Pełnoletni" : "Niepełnoletni";
        System.out.println(status);

        sc.close();
    }
}
