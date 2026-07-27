package com.example.task_11_lambda;

import java.util.Scanner;
import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        Function<String, Integer> noSpacesLength = s -> s.replace(" ", "").length();
        Function<String, Integer> countVowels = s -> {
            int count = 0;
            for (char c : s.toLowerCase().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            return count;
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println("spaces: " + countVowels.apply(input));
        System.out.println("vowels: " + countVowels.apply(input));
    }
}
