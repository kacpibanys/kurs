package com.example.task_11_lambda;

import java.util.Random;
import java.util.function.Supplier;

public class Task10 {
    public static void main(String[] args) {
        Supplier<String> codeSupplier = () -> {
            int length = 6;
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            Random random = new Random();
            StringBuilder sb = new StringBuilder(length);

            for (int i = 0; i < length; i++) {
                int randomIndex = random.nextInt(chars.length());
                sb.append(chars.charAt(randomIndex));
            }
            return sb.toString();
        };
        String[] codes = new String[10];
        for (int i = 0; i < 10; i++) {
            codes[i] = codeSupplier.get();
            System.out.println(codes[i]);
        }
    }
}
