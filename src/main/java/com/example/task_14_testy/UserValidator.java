package com.example.task_14_testy;

import java.util.Objects;

public class UserValidator {
    String validateEmail(String email){
        if (Objects.isNull(email)) {
            throw new NullPointerException("Null email address");
        }
        if (email.isEmpty()) {
            throw new IllegalArgumentException("Empty email address");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        return email;
    }
}
