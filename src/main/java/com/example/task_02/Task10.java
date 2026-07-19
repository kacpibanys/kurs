package com.example.task_02;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        if (number % 7 == 0) {
            number = number + 7;
            System.out.println(number);
        }else  {
            for(int i = number; i <= 7; i++) {
                if(i % 7 == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
