package com.example.task_14_testy;

public class StringUtils {
    public boolean isPalindrome(String text){
        if(text == null)return true;

        String clean = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }
}
