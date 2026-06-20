package com.example.task_04;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int x = 5;
        x = changeX(x);
        System.out.println(x);
    }

    public static int changeX(int x){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a new X: ");
        int newX = input.nextInt();
        input.close();
        x = newX;
        return x;
    }
}
