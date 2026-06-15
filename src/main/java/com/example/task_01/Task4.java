package com.example.task_01;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in an temperature: ");
        double temperature = sc.nextDouble();
        if (temperature < 0) {
            System.out.println("Freeze");
        }
        if (temperature >= 0 && temperature <= 15) {
            System.out.println("Cold");
        }
        if (temperature >= 16 && temperature <= 25) {
            System.out.println("Warm");
        }
        if (temperature > 25) {
            System.out.println("Hot");
        }
        sc.close();
    }
}
