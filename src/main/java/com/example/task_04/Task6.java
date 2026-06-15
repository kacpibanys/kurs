package com.example.task_04;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        System.out.println(whatAge(input.nextInt()));
    }

    public static String whatAge(int age){
        if (age < 12 && age >= 0) {
            return "You are a child";
        }
        if (age >= 12 && age <= 17) {
            return "You are a teenager";
        }
        if (age >= 18 && age <= 64) {
            return "You are an adult";
        }
        if (age >= 65) {
            return "You are a senior";
        }
        return "Invalid age";
    }
}
