package com.example.task_11_lambda;

public class Task1 {
    static void main(String[] args) {
        Runnable runnable1 = () -> System.out.println("Startuję program...");
        Runnable runnable2 = () -> System.out.println("Kończę program");

        runnable1.run();
        runnable2.run();
    }
}
