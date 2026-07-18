package com.example.task_05;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an amount to convert");
        BigDecimal value = new BigDecimal(sc.next());
        sc.close();
        BigDecimal exchangeRate = new BigDecimal("4.25");
        BigDecimal echangedValue = value.multiply(exchangeRate).setScale(2, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(value + " PLN converted to EUR is: " + echangedValue);
    }
}
