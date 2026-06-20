package com.example.task_08_exceptions;

public class Task2 {
    static class InvalidNumberException extends RuntimeException {
        public InvalidNumberException(String msg, Throwable cause) { super(msg, cause); }
    }

    final class NumberParser {
        static int parsePositiveInt(String s) {
            // TODO: parsowanie, obsługa NFE -> wrap w InvalidNumberException z cause
            int value;
            try{
                value = Integer.parseInt(s);
            } catch(NumberFormatException e){
                throw new InvalidNumberException("Invalid number <" + s + "> ",e);
            }

            if (value <= 0){
                throw new IllegalArgumentException("non-positive: " + value);
            }

            return value;
        }
    }

    static void main(String[] args) {
        String textToParse = "-12";
        System.out.println(NumberParser.parsePositiveInt(textToParse));
    }
}
