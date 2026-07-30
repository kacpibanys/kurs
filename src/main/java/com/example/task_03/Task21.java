package com.example.task_03;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textToPrint = sc.nextLine();
        sc.close();
        String text = textToPrint.replace(" ", "");

        boolean isPalindrome = true;

        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(textToPrint + " is a palindrome");
        } else {
            System.out.println(textToPrint + " is not a palindrome");
        }
    }
}
