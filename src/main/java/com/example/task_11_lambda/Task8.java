package com.example.task_11_lambda;

import java.util.List;
import java.util.function.Consumer;

public class Task8 {
    static void printWithNumbers(List<String> lines, Consumer<String> consumer){
        int count = 0;
        for (int i = 0; i < lines.size(); i++) {
            ++count;
            consumer.accept(count + ") " + lines.get(i));
        }
    }
    public static void main(String[] args) {
        Consumer<String> logger = System.out::println;
        List<String> lines = List.of("lala1", "lala2", "lala3", "lala4");

        printWithNumbers(lines, logger);
    }
}