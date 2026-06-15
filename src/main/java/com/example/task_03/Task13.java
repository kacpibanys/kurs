package com.example.task_03;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String text = sc.nextLine();
        Character[] arr = new Character[text.length()];
        for(int i=0;i<text.length();i++){
            arr[i] = text.charAt(i);
            System.out.println(arr[i]);
        }
    }
}
