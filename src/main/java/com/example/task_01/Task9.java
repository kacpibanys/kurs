package com.example.task_01;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your first number: ");
        double number1 = sc.nextDouble();

        System.out.println("Type your second number: ");
        double number2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Type your operator: ");
        String operator = sc.nextLine();

        double output = switch (operator) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            case "/" -> number1 / number2;
            case "%" -> number1 % number2;
            default -> 0;
        };
        sc.close();

        if (operator.equals("/") && number2 == 0) {
            System.out.println("Pamietaj cholero, nie dziel nigdy przez 0!");
        } else if (output == 0) {
            System.out.println("No such an operation");
        } else {
            System.out.println(output);
        }
    }
}
