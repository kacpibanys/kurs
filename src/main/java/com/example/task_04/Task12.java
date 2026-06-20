package com.example.task_04;

public class Task12 {
    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
