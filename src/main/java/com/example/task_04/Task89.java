package com.example.task_04;

public class Task89 {
    public static void main(String[] args) {
        System.out.println(factorialFor(5));
        System.out.println(factorialFor(4));
        System.out.println(factorialFor(3));
        System.out.println(factorialFor(2));
        System.out.println(factorialRec(5));
        System.out.println(factorialRec(4));
        System.out.println(factorialRec(3));
        System.out.println(factorialRec(2));
    }

    public static int factorialFor(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRec(int n) {
        if(n <= 1) return 1;
        return n  * factorialRec(n - 1);
    }
}
