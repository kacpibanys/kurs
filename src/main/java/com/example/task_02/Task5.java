package com.example.task_02;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String text = scanner.nextLine();
        scanner.close();
        String letter = "a";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter.charAt(0)) {
                int letterPosition = i+1;
                System.out.println("First letter 'a' is at " + letterPosition + " place");
                break;
            } else if (i == text.length() - 1) {
                System.out.println("Text doesnt contain letter " + letter);
            }
        }
    }
}
