package com.example.task_11_lambda;

import java.util.function.BiPredicate;

public class Task7 {
    static void main(String[] args) {
        BiPredicate<String, String> sameIgnoreCase = String::equalsIgnoreCase;

        BiPredicate<String, String> isSuffix =  String::endsWith;

        String text1 = "java";
        String text2 = "Java";
        String text3 = "java.pdf";
        String text4 = "pdf";

        System.out.println(sameIgnoreCase.test(text1, text2));

        System.out.println(isSuffix.test(text3, text4));

    }
}