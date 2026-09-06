package com.example.task10_Generyki;

public class StatsTest {
    public static void main(String[] args) {
        System.out.println("----------------srednia i wariancja");
        Integer[] a = {1, 2, 3, 4};
        Stats<Integer> statsA = new Stats<>(a);

        System.out.println("Dane: [1, 2, 3, 4]");
        System.out.println("mean()     : " + statsA.mean());
        System.out.println("variance() : " + statsA.variance());


        System.out.println("-----------------wzor");
        Double[] x = {2.0, 2.0};
        Double[] y = {2.001, 1.999};

        Stats<Double> statsX = new Stats<>(x);
        Stats<Double> statsY = new Stats<>(y);

        double eps = 0.01;
        boolean isSameMean = statsX.hasSameMean(statsY, eps);

        System.out.println("x = [2.0, 2.0], y = [2.001, 1.999], eps = " + eps);
        System.out.println("hasSameMean(x, y, eps) : " + isSameMean);


        System.out.println("----------------tablica");
        Integer[] emptyArr = {};

        try {
            Stats<Integer> emptyStats = new Stats<>(emptyArr);
        } catch (IllegalArgumentException e) {
            System.out.println("wyjatek: " + e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
}
