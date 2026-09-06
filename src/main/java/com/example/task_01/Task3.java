package com.example.task_01;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in an age: ");
        int age = sc.nextInt();
        if (age < 12) {
            System.out.println("You are a child");
        }
        if (age >= 12 && age <= 17) {
            System.out.println("You are a teenager");
        }
        if (age >= 18 && age <= 64) {
            System.out.println("You are an adult");
        }
        if (age >= 65) {
            System.out.println("You are a senior");
        }
        sc.close();
    }
}
