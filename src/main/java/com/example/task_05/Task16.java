package com.example.task_05;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();
        if (text.startsWith("Java") && text.endsWith("2025")) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
