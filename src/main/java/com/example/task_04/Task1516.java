package com.example.task_04;

public class Task1516 {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Suma cyfr liczby " + number + " wynosi: " + digitSumFor(number));
        System.out.println("Suma cyfr liczby " + number + " wynosi: " + digitSumRec(number));
    }
    public static int digitSumFor(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
     public static int digitSumRec(int n) {
        if (n == 0){
            return 0;
        };
        return n%10 + digitSumRec(n/10);

     }


}
