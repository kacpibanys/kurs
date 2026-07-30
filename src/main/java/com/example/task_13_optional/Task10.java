package com.example.task_13_optional;

import java.util.Optional;

public class Task10 {
    static void main(String[] args) {
        System.out.println("test A");
        System.out.println(findValue("A"));
        System.out.println("test B");
        System.out.println(findValue("B"));
        System.out.println("test C");
        System.out.println(findValue("C"));
    }

    static Optional<String> findInCache(String key) {
        // zwraca wartość tylko dla klucza "A"
        System.out.println("Szukam w cache...");
        if ("A".equals(key)) {
            return Optional.of("cache value");
        }
        return Optional.empty();
    }

    static Optional<String> findInDatabase(String key) {
        // zwraca wartość tylko dla klucza "B"
        System.out.println("Szukam w database...");
        if("B".equals(key)) {
            return Optional.of("db value");
        }
        return Optional.empty();
    }

    static Optional<String> findDefault(String key) {
        // zawsze zwraca wartość domyślną
        System.out.println("Szukam default...");
        return Optional.of("default value");
    }

    static String findValue(String key){
        return findInCache(key)
                .or(() -> findInDatabase(key))
                .or(() -> findDefault(key))
                .orElse("brak");
    }
}
