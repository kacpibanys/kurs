package com.example.task_05;

import java.math.BigDecimal;

public class Task10 {
    public static void main(String[] args) {
        double aDouble = 0.1;
        double bDouble = 0.2;
        BigDecimal aBigDecimal = new BigDecimal("0.1");
        BigDecimal bBigDecimal = new BigDecimal("0.2");

        double sumDouble = aDouble + bDouble;
        BigDecimal sumBigDecimal = aBigDecimal.add(bBigDecimal);

        if (sumDouble == sumBigDecimal.doubleValue()) {
            System.out.println("They are the same");
        }else  {
            System.out.println("They are not the same");
            System.out.println("sumDouble is " + sumDouble);
            System.out.println("sumBigDecimal is " + sumBigDecimal);
        }
    }
}
