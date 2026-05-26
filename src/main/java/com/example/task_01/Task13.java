package com.example.task_01;

import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Choose your move (r - rock, p - paper, s - scissors): ");
        String playerMove = sc.nextLine().toLowerCase();
        sc.close();


        if (!playerMove.equals("r") && !playerMove.equals("p") && !playerMove.equals("s")) {
            System.out.println("Error: unknown move");
            return;
        }

        int randomNumber = random.nextInt(3);
        String computerMove = switch (randomNumber) {
            case 0 -> "r";
            case 1 -> "p";
            default -> "s";
        };


        String compFullWord = computerMove.equals("r") ? "Rock" : computerMove.equals("p") ? "{Paper}" : "Scissors";
        System.out.println("Computer chose: " + compFullWord);


        if (playerMove.equals(computerMove)) {
            System.out.println("A draw");
        } else {
            String matchUp = playerMove + computerMove;
            String result = switch (matchUp) {
                case "rs", "pr", "sp" -> "You won";
                default -> "Computer won";
            };

            System.out.println(result);
        }
    }
}
