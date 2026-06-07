package com.example.task_05;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int[] n = new int[sc.nextInt()];
        sc.nextLine();

        BigDecimal sum = new BigDecimal("0");
        for (int i = 0; i < n.length; i++) {
            System.out.println("Enter an element of array");
            BigDecimal element = new BigDecimal(sc.nextLine());
            n[i] = element.intValue();
            sum = sum.add(element);
        }
        System.out.println("The sum is " + sum.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal len = new BigDecimal(n.length);
        System.out.println("Avg is: " + sum.divide(len, BigDecimal.ROUND_HALF_UP));
        sc.close();
    }
}
