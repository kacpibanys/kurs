package com.example.task_13_optional;

import java.util.Optional;
import java.util.Scanner;

public class Task3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shortCity = sc.nextLine();
        sc.close();
        System.out.println(getCityOrDefault(shortCity));
    }
    static String getCityOrDefault(String code){

        return switch (code){
            case "WA" -> "Warsaw";
            case "KR" -> "Kraków";
            case "GD" -> "Gdańsk";
            default -> String.valueOf(Optional.empty().orElse("Nieznane miasto"));
        };
    }
}
