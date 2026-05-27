package com.example.task_02;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        do {
            System.out.println("Ennter number: ");
            n = scanner.nextInt();
            sum += n;
        }while (n != 0);
        scanner.close();
        System.out.println(sum);
    }
}
