package com.example.task_05;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Task1720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name");
        String productName = sc.nextLine();
        System.out.println("Enter price");
        BigDecimal price = new BigDecimal(sc.nextLine()).setScale(2, BigDecimal.ROUND_HALF_DOWN);
        sc.close();
        printDetails(productName, price);

        //TASK 18
        BigDecimal[] priceList = {new BigDecimal("12.34"), new BigDecimal("17.89"), new BigDecimal("34.66")};
        for (int i = 0; i < priceList.length; i++) {
            System.out.println("Price " + (i + 1) + ": " + priceList[i]);
        }


        //TASK 19
        BigDecimal bill = new BigDecimal("12.35");
        BigDecimal peopleN = new BigDecimal("4");
        System.out.println(bill.divide(peopleN, BigDecimal.ROUND_HALF_DOWN));

        //TASK 20
        System.out.println(price.setScale(2, BigDecimal.ROUND_CEILING));
    }

    public static void printDetails(String productName, BigDecimal price) {
        String details = String.format(Locale.US, "Product: %s, price: %s PLN", productName, price);
        System.out.println(details);
    }
}
