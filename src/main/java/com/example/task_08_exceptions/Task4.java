package com.example.task_08_exceptions;

public class Task4 {
    final class CommandProcessor {
        static void processCommand(String cmd) {
            // TODO: warunki i rzucanie wyjątków
            switch (cmd) {
                case "ARG" -> throw new IllegalArgumentException("bad arg");
                case "STATE" -> throw new IllegalStateException("bad state");
                default -> System.out.println("command ok");
            }
        }
        static void demo() {
            // TODO: wywołania + multi-catch
            String[] commands = { "DUPA", "ARG", "STATE" };
            for (String command : commands) {
                try {
                    System.out.println("checking command: " + command);
                    processCommand(command);
                } catch (IllegalArgumentException | IllegalStateException e) {
                    System.out.println("E R R O R: " + e.getMessage());
                }
            }
        }
    }

    static void main(String[] args) {
        CommandProcessor.demo();
    }
}
