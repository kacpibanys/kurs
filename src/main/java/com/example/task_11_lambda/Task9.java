package com.example.task_11_lambda;

import java.util.Map;
import java.util.function.BiConsumer;

public class Task9 {

    static void printReport(Map<String, Integer> map, BiConsumer<String, Integer> consumer) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            map.forEach(consumer);
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "A", 10,
                "B", 20,
                "C", 30
        );

        BiConsumer<String, Integer> reportPrinter = (key, value) ->
                System.out.println("key: " + key + "\nvalue: " + value);

        printReport(map, reportPrinter);
    }
}