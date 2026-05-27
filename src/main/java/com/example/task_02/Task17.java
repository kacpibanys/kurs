package com.example.task_02;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x = input.nextInt();
        System.out.println("Please enter a number");
        int y = input.nextInt();
        input.close();
        int output = 1;
        if (y == 0){
            System.out.println(output);
        }else {
            for (int i = 1; i <= y; i++) {
                output = output * x;
            }
            System.out.println(output);
        }


    }
}
