package com.example.task_02;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int highestNumber = 0;
        int newNumber;
        do {
            System.out.println("Enter a number: ");
            newNumber =  sc.nextInt();
            sc.nextLine();
            if (newNumber > highestNumber) {
                highestNumber = newNumber;
            }
        }while (newNumber != 0);
        sc.close();
        System.out.println(highestNumber);
    }
}
