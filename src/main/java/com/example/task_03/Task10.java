package com.example.task_03;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        int[] arrReversed = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter an element of array");
            arr[i] = sc.nextInt();
            arrReversed[n-1-i] = arr[i];
        }
        sc.close();
        System.out.println("Array before reversing");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array after reversing");
        System.out.println(Arrays.toString(arrReversed));
    }
}
