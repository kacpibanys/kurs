package com.example.task_13_optional;

import java.util.Optional;
import java.util.Scanner;

public class Task2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shortCity = sc.nextLine();
        sc.close();
        System.out.println(findCityByCode(shortCity));
    }
    static Optional<String> findCityByCode(String code){


        String city = switch (code){
            case "WA" -> "Warsaw";
            case "KR" -> "Kraków";
            case "GD" -> "Gdańsk";
            default -> String.valueOf(Optional.empty());
        };

        return Optional.of(city);
    }
}
