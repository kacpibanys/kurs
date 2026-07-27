package com.example.task_11_lambda;

import java.util.List;

public class Task14 {
    @FunctionalInterface
    interface PriceStrategy {
        double apply(double basePrice);
    }

    static void main(String[] args) {
        PriceStrategy normal = (basePrice) -> basePrice;
        PriceStrategy student = (basePrice) -> basePrice * 0.9;
        PriceStrategy vip = (basePrice) -> basePrice * 0.8;
        PriceStrategy blackFriday = (basePrice) -> basePrice * 0.7;

        double[] testPrices = {100.0, 250.0, 399.0};

        for (double price : testPrices) {
            System.out.println("normal: " + calculatePrice(price, normal));
            System.out.println("student: " + calculatePrice(price, student));
            System.out.println("vip: " + calculatePrice(price, vip));
            System.out.println("bf: " + calculatePrice(price, blackFriday));
            System.out.println();
        }
    }

    static double calculatePrice(double basePrice, PriceStrategy strategy) {
        return strategy.apply(basePrice);
    }
}
