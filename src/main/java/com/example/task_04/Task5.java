package com.example.task_04;

public class Task5 {
    public static void main(String[] args) {
        System.out.printf("Rounded avg: %.2f", avg(2,3,3));
    }

    public static double avg(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
