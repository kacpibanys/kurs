package com.example.task_11_lambda;

public class Task11 {
    @FunctionalInterface
    interface StringFormatter {
        String format(String input);
    }

    static String applyFormat(String text, StringFormatter formatter) {
        return formatter.format(text);
    }

    static void main(String[] args) {
        StringFormatter upperCaser = String::toUpperCase;
        StringFormatter prefixer = s -> ">>> " + s;
        StringFormatter flipper = s -> {
            return new StringBuilder(s).reverse().toString();
        };

        String testWord = "jaVa";
        System.out.println(applyFormat(testWord, upperCaser));
        System.out.println(applyFormat(testWord, prefixer));
        System.out.println(applyFormat(testWord, flipper));
    }
}
