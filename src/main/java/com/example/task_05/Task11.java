package com.example.task_05;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter txt");
        String text = sc.nextLine();
        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        StringBuilder reversed = new StringBuilder();
        reversed.append(text);
        System.out.println(reversed.reverse().toString());
    }
}
