package com.example.task_01;

import java.util.Scanner;

public class luzne {
    public static void main(String[] args) {
        String password;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Podaj hasło: ");
            password = sc.nextLine();
        } while (!password.equals("admin"));
        sc.close();
        System.out.println("Logged in");
    }
}
//Napisz program z pętlą do-while, który pobiera od użytkownika hasło (za pomocą klasy Scanner) aż wpisze poprawne słowo "admin"