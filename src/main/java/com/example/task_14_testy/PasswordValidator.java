package com.example.task_14_testy;

public class PasswordValidator {
    public static boolean isValid(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasUppercase = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
        }

        return hasDigit && hasUppercase;
    }
}
