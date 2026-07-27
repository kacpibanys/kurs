package com.example.task_03;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arrSummedUp = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter an element of array 1");
            arr1[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter an element of array 2");
            arr2[i] = sc.nextInt();
            sc.nextLine();
            arrSummedUp[i] = arr1[i] + arr2[i];
        }
        sc.close();

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arrSummedUp: " + Arrays.toString(arrSummedUp));
    }
}
