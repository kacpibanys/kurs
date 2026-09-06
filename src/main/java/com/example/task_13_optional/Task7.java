package com.example.task_13_optional;

import java.util.Optional;

public class Task7 {
    static void main(String[] args) {
        Optional<String> gitMail = Optional.of("jan.kowalski@example.com");
        Optional<String> emptyMail = Optional.empty();

        System.out.println(extractLogin(gitMail));
        System.out.println(extractLogin(emptyMail));

    }
    static Optional<String> extractLogin(Optional<String> email){
        return email
                .map(e -> e.split("@")[0])
                .map(String::toUpperCase);
    }

}
