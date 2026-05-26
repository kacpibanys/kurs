package com.example.task_01;

import java.util.Scanner;

public class Task11and12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type day: ");
        int day = sc.nextInt();
        System.out.println("Type month: ");
        int month = sc.nextInt();
        System.out.println("Type year: ");
        int year = sc.nextInt();
        sc.close();

        boolean isLeap = isLeapYear(year);
        if (isLeap) {
            System.out.println("Rok przestępny");
        } else {
            System.out.println("Rok nieprzestępny");
        }


        if (isDateValid(day, month, year)) {
            System.out.println("Correct date");
        } else {
            System.out.println("Wrong date");
        }
    }


    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isDateValid(int day, int month, int year) {

        if (month < 1 || month > 12 || day < 1) {
            return false;
        }

        int maxDays = switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 31;
        };

        return day <= maxDays;
    }
}
