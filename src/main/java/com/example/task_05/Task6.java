package com.example.task_05;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a number A");
        BigDecimal a  = new BigDecimal(sc.next());
        System.out.println("Enter the value of a number B");
        BigDecimal b = new BigDecimal(sc.next());
        if(a.compareTo(b)==0){
            System.out.println("The value of a number A is equal to B");
        }else {
            System.out.println("The value of a number A is not equal to B");
        }
    }
}
