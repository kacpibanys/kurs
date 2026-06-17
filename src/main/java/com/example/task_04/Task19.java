package com.example.task_04;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            menu();
            System.out.println("Choose an option:");
            choice = sc.nextInt();
            sc.nextLine();
            double a = 0;
            double b = 0;

            if (choice >= 1 && choice <= 3) {
                System.out.println("Enter first number: ");
                a = sc.nextDouble();
                System.out.println("Enter second number: ");
                b = sc.nextDouble();
            }

            switch (choice) {
                case 1:
                    System.out.println("Addition result (" + a + " , " + b + " is: " + add(a, b));
                    break;
                case 2:
                    System.out.println("Subtraction result (" + a + " , " + b + " is: " + subtract(a, b));
                    break;
                case 3:
                    System.out.println("Multiplication result (" + a + " , " + b + " is: " + multiply(a, b));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Error, unknown choice");
                    break;
            }

        }
        sc.close();
    }

    public static void menu() {
        System.out.println("CALCULATOR");
        System.out.println("1 - ADD");
        System.out.println("2 - SUBTRACT");
        System.out.println("3 - MULTIPLY");
        System.out.println("0 - EXIT");
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
}
