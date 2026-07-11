package com.example.task10_Generyki;

import java.math.BigDecimal;

public final class Stats<T extends Number> {
    private final T[] data;

    public Stats(T[] data) {
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException("array cannot be null");
        }
        this.data = data.clone();
    }

    public double mean() {
        /* średnia arytmetyczna */
        double sum = 0.0;
        for (T element : data) {
            sum += element.doubleValue(); // Korzystamy z metody gwarantowanej przez 'extends Number'
        }
        return sum / data.length;
    }

    public double variance() {
        /* wariancja populacyjna */
        double mean = mean();
        double sumSqDiff = 0.0;
        for (T element : data) {
            double diff = element.doubleValue() - mean;
            sumSqDiff += diff * diff; // Kwadrat różnicy od średniej
        }
        return sumSqDiff / data.length;
    }

    public boolean hasSameMean(Stats<?> other, double eps) {
        /* |m1-m2| <= eps */
        return Math.abs(this.mean() - other.mean()) <= eps;
    }
}
