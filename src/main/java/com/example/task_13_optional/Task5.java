package com.example.task_13_optional;

import java.util.Map;
import java.util.Optional;

public class Task5 {
    static void main(String[] args) {
        try {
            String url = AppConfig.getRequired("db.url");
            System.out.println("value of key 'db.url': " + url);
        } catch (IllegalArgumentException e) {
            System.out.println("error: " + e.getMessage());
        }

        try {
            String password = AppConfig.getRequired("db.password");
            System.out.println("value of key 'db.password': " + password);
        } catch (IllegalArgumentException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
    public static class AppConfig {
        static String getRequired(String key){

            Map<String, String> config = Map.of(
                    "db.url", "jdbc:mysql://localhost:3306/app",
                    "db.user", "admin"
            );

            return Optional.ofNullable(config.get(key))
                    .orElseThrow(() -> new IllegalArgumentException("no such a key: " + key));
        }
    }
}
