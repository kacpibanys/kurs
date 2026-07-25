package com.example.task_11_lambda;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Task4 {
    static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        BiFunction<Integer, Integer, Integer> sub = (a, b) -> a - b;
        BiFunction<Integer, Integer, Integer> mul = (a, b) -> a * b;
        BiFunction<Integer, Integer, Integer> div = (a, b) -> a / b;

        Scanner scanner = new Scanner(System.in);


        System.out.print("a: ");
        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        System.out.print("operation (+, -, *, /): ");
        String operator = scanner.next();

        scanner.close();

        switch (operator) {
            case "+":
                System.out.println("result: " + calculate(a, b, add));
                break;
            case "-":
                System.out.println("result: " + calculate(a, b, sub));
                break;
            case "*":
                System.out.println("result: " + calculate(a, b, mul));
                break;
            case "/":
                if (b != 0) {
                    System.out.println("result: " + calculate(a, b, div));
                } else {
                    System.out.println("Error: nie dziel przez zero cholero");
                }
                break;
            default:
                System.out.println("Error: wrong sign.");
                break;
        }

    }

    static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> op) {
        return op.apply(a, b);
    }
}
