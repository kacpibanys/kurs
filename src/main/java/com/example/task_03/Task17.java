package com.example.task_03;

import java.util.Arrays;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][3];
        System.out.println("arr.length " + arr.length);
        System.out.println("arr[0].length " + arr[0].length);


        for (int j = 0; j < 3; j++) {

            int sumaKolumny = 0;

            for (int i = 0; i < 2; i++) {
                System.out.println("Enter number for column " + (j + 1));
                int newNumber = sc.nextInt();
                arr[i][j] = newNumber;
                sumaKolumny += arr[i][j];
            }

            System.out.println("Suma of column " + j + 1 + " is " + sumaKolumny);
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
