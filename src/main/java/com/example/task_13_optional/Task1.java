package com.example.task_13_optional;

import java.util.Optional;

public class Task1 {
    static void main(String[] args) {
        Optional<String> opt1 = Optional.of("Hello");
        String opt2Str = "lala";
        Optional<String> opt2 = Optional.ofNullable(opt2Str);
        Optional<String> opt3 = Optional.empty();

        System.out.println("opt1: present=" + opt1.isPresent() + ", empty=" + opt1.isEmpty());
        System.out.println("opt2: present=" + opt2.isPresent() + ", empty=" + opt2.isEmpty());
        System.out.println("opt3: present=" + opt3.isPresent() + ", empty=" + opt3.isEmpty());

        //Optional<String> opt4 = Optional.of(null);
        //nullpointer



    }
}
