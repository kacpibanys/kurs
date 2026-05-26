package com.example.task_01;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your password: ");
        String password = sc.nextLine();
        sc.close();

        if (password.length() > 7 && Character.isUpperCase(password.charAt(0)) ) {
            System.out.println("Ok");
        } else if (password.length() < 7) {
            System.out.println("Password too short");
        } else if (password.length() > 7 && Character.isLowerCase(password.charAt(0))) {
            System.out.println("Password has to start with uppercase letter");
        }
    }
}
