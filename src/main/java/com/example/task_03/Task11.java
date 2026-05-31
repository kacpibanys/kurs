package com.example.task_03;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        int[] arrFirstAndLastReversed = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter an element of array");
            arr[i] = sc.nextInt();
            if(i==0 || i == n-1){
                arrFirstAndLastReversed[n-1-i] = arr[i];
            }else {
                arrFirstAndLastReversed[i] = arr[i];
            }
        }
        sc.close();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrFirstAndLastReversed));

    }
}
