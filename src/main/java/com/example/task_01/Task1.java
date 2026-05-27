package com.example.task_01;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek:");
        if (scanner.hasNextInt()) {
            int wiek = scanner.nextInt();
            if (wiek >= 18) {
                System.out.println("Jesteś pełnoletni.");
            } else {
                System.out.println("Nie jesteś pełnoletni.");
            }
        } else {
            System.out.println("Błąd");
        }

        scanner.close();
    }
}

//1. nowy branch: TASK-01-ifs
//2. commit -m "TASK-1 add if tasks" do brancha i push
//3. wystawienie pr z brancha z zadaniem

//1.5 robie zadania/zadanie
//2. commit -m "task-1 add nesxt subtastks 2-5"
//3. wystawienie pr z brancha z zadaniem 1 i wyslanie na chat

