package com.example.task_05;

import java.math.BigDecimal;

public class Task1 {
    public static void main(String[] args) {
        //Task 1
        System.out.println("\nTASK 1");

        BigDecimal a = new BigDecimal("10.50");
        BigDecimal b = new BigDecimal("2.25");
        BigDecimal sum = a.add(b);
        System.out.println(sum);
        BigDecimal diff = a.subtract(b);
        System.out.println(diff);
        BigDecimal prod = a.multiply(b);
        System.out.println(prod);
        BigDecimal quotient = a.divide(b, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(quotient);

        //Task 2
        System.out.println("\nTASK 2");
        BigDecimal c = new BigDecimal(10.50);
        System.out.println(a);
        System.out.println(c);

        //Task 3
        System.out.println("\nTASK 3");
        BigDecimal d = new BigDecimal(10.56789).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(d);
    }
}
