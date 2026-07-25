package com.example.task_11_lambda;

import java.util.function.Predicate;

public class Task6 {
    static void main(String[] args) {
        String[] loginy = {"adam", "Ala123", "x", "User_01", "ADMIN", "gość"};

        Predicate<String> isValidLogin = login ->
                login.length() >= 3 &&
                        login.matches("[a-zA-Z0-9]+") &&
                        login.matches("^[a-zA-Z].*");

        int validCount = 0;

        System.out.println("git loginy: ");
        for (String login : loginy) {
            if (isValidLogin.test(login)) {
                System.out.println(login);
                validCount++;
            }
        }

        System.out.println("ilosc: " + validCount);
    }
}
