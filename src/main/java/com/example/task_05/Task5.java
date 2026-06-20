package com.example.task_05;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal price = new BigDecimal(sc.nextLine());
        //System.out.println(price);
        sc.close();
        BigDecimal priceGross = price.multiply(BigDecimal.valueOf(1.23)).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(priceGross);

    }
}
