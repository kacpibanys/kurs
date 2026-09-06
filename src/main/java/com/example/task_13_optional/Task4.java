package com.example.task_13_optional;

import java.util.Optional;

public class Task4 {
    static String generateDefault() {
        System.out.println("  >> Generuję wartość domyślną...");
        return "DOMYŚLNA";
    }
    public static void main(String[] args) {
        Optional<String> fullOpt = Optional.of("dupa");
        Optional<String> emptyOpt = Optional.empty();

        System.out.println("orElse");

        String res1 = fullOpt.orElse(generateDefault());
        System.out.println("res1: " + res1 + "\n");
        String res2 = emptyOpt.orElse(generateDefault());
        System.out.println("res2: " + res2 + "\n");

        System.out.println("orElseGet");
        // orElseGet ewaluuje lambdę TYLKO gdy Optional jest pusty
        String res3 = fullOpt.orElseGet(() -> generateDefault());
        System.out.println("res3: " + res3 + "\n");

        String res4 = emptyOpt.orElseGet(() -> generateDefault());
        System.out.println("res4: " + res4 + "\n");
    }
}
