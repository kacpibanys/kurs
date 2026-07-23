package com.example.task_11_lambda;

import java.util.Arrays;
import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        Function<String, String> trimSpaces = String::trim;
        Function<String, String> toLowerCase = String::toLowerCase;
        Function<String, String> removeInnerSpaces = s -> s.replace(" ", "");

        Function<String, String> normalizeLogin = trimSpaces
                .andThen(toLowerCase)
                .andThen(removeInnerSpaces);

        String[] loginy = {" Adam ", "ANIA K ", " k o w a l "};

        String[] normalizedLogins = Arrays.stream(loginy)
                .map(normalizeLogin)
                .toArray(String[]::new);

        for (String login : normalizedLogins) {
            System.out.println(login);
        }
    }
}
