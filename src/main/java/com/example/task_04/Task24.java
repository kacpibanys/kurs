package com.example.task_04;

public class Task24 {
    public static void main(String[] args) {
        System.out.println("TASK 2");
        System.out.println(multiplication(2,3));

        System.out.println("TASK 3");
        int max = max(2,3);
        System.out.println(max);

        System.out.println("TASK 4");
        System.out.println(even(5));

    }

    public static int multiplication(int a, int b){
        return a*b;
    }

    public static int max(int a, int b) {
        String error = "They are equal";
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    public static boolean even(int a){
        if (a%2!=0) return false;
        else return true;
    }
}
