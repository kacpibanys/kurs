package com.example.task_02;

import java.util.Scanner;

public class Task13 {
    //do zrobienia na stacjo
    public static void main(String[] args) {
        String login;
        String correctLogin = "login";
        String correctPassword = "password";
        String password;
        int limit = 3;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= limit; i++) {
            System.out.println("Enter your login:");
            login = sc.nextLine();
            System.out.println("Enter your password:");
            password = sc.nextLine();
            if (login.equals(correctLogin) && password.equals(correctPassword)) {
                System.out.println("Logged in");
                break;
            } else {
                System.out.println("Wrong login or password. Try again");
            }
            if (i == limit){
                System.out.println("You have reached the maximum limit. Your account is blocked");
            }
        }

    }
}
