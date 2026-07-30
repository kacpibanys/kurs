package com.example.task_02;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }else  {
                continue;
            }
        }
    }
}
