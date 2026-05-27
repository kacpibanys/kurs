package com.example.task_02;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String password;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Podaj hasło: ");
            password = sc.nextLine();
        } while (!password.equals("admin"));
        sc.close();
        System.out.println("Logged in");
    }
}
