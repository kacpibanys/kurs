package com.example.task_02;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        scanner.close();
        while (number > -1) {
            System.out.println(number);
            number--;
        }
    }
}
