package com.example.task_05;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price");
        BigDecimal price = sc.nextBigDecimal();
        System.out.println("Enter the discount");
        BigDecimal discount = sc.nextBigDecimal();
        BigDecimal hundered = new BigDecimal(100);
        sc.close();
        BigDecimal reducedPrice = price
                .subtract(price
                        .multiply(discount
                                .divide(hundered)))
                .setScale(2, BigDecimal.ROUND_HALF_UP);

        System.out.println(reducedPrice);
    }
}
