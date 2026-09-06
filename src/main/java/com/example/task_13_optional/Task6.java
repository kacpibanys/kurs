package com.example.task_13_optional;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class Task6 {
    static void main(String[] args) {
        String[] nicki = {"Janek", null, "Ania", null, "Kuba"};
        System.out.println("A");
        for (String nick : nicki) {
            Optional<String> nickName = Optional.ofNullable(nick);
            nickName.ifPresent(n -> System.out.println("Znaleziono: <" + n + ">"));
        }

        System.out.println("B");
        Runnable noNick = () -> System.out.println("Brak nicka");
        for (String nick : nicki) {
            Optional<String> nickName = Optional.ofNullable(nick);
            nickName.ifPresentOrElse(n -> System.out.println("Znaleziono: <" + n + ">"), noNick);
        }
    }
}
