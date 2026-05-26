package com.example.task_01;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a category: ");
        String category = sc.nextLine();
        sc.close();
        String vat = switch (category) {
            case "żywność" -> "5%";
            case "książki" -> "8%";
            case "usługi" -> "23%";
            case "ubrania" -> "23%";
            case "elektronika" -> "23%";
            default -> "unspecified";
        };
        System.out.println(vat);
    }

}
