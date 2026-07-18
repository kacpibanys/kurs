package com.example.task_10_Generyki;

public class MinMaxTest {
    public static void main(String[] args) {
        System.out.println("-----------------ciag znakow");
        String[] s = {"aa", "b", "ccc"};
        System.out.println("minMax(s) : " + MinMax.minMax(s));


        System.out.println("-----------------liczby całkowite");
        Integer[] a = {5, 5, -1, 10, 10};
        System.out.println("minMax(a) : " + MinMax.minMax(a));


        System.out.println("-----------------pojedynczy element");
        Integer[] x = {42};
        System.out.println("minMax(x) : " + MinMax.minMax(x));


        System.out.println("-----------------null");
        Integer[] arrWithNull = {1, null, 2};

        try {
            MinMax.minMax(arrWithNull);
        } catch (IllegalArgumentException e) {
            System.out.println("wyjatek: " + e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
}
